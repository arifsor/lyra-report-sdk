package com.lyra.reportsdk.service;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.HtmlExporter;
import net.sf.jasperreports.export.Exporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleHtmlExporterConfiguration;
import net.sf.jasperreports.export.SimpleHtmlExporterOutput;
import net.sf.jasperreports.export.SimpleHtmlReportConfiguration;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReportService {

  public String exportReport(File file, Collection<?> beanCollection, String pageNo) throws JRException {

    //Compile JRXML to Jasper
    final JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

    //Prepare report parameters
    final Map<String, Object> parameters = new HashMap<>();
    parameters.put("COMPANY_NAME", "Syed Brothers Hardware Inc");
    parameters.put("COMPANY_ADDRESS", "2345 Spectrum Way, Mississauga, Ontario");
    parameters.put("COMPANY_PHONE", "+1 366 377 7833");
    parameters.put("COMPANY_FAX", "+1 787 873 3773");
    parameters.put("POWERED_BY", "NA");
    parameters.put("SUPPORT_EMAIL", "support@lyrasdk.com");
    parameters.put("PERIOD", "Jan 1, 2020 - 31, Jan 2020");
    parameters.put("PRODUCT_NAME", "lyra-sdk");
    parameters.put("COPY_RIGHTS", "All rights reserved by LYRA Sdk");
    parameters.put("SUPPORTED_BY", "LYRA-SDK");
    parameters.put("SYSTEM_USER", "Arif Sorathia");
    parameters.put("COMPANY_PHONE_FAX_INFO", "+1 987 766 6678");
    parameters.put("EMAIL_WEB", "info@abc.com");

    //Fill report with datasource
    final JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(beanCollection);
    final JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
    final Integer totalPageCount = jasperPrint.getPages().size();
    //Prepare report configuration

    SimpleHtmlReportConfiguration reportConfig = new SimpleHtmlReportConfiguration();
    SimpleHtmlExporterConfiguration htmlExporterConfiguration = new SimpleHtmlExporterConfiguration();

    if(pageNo != null) {
      Integer currentPageNo = Integer.valueOf(pageNo) - 1;
      reportConfig.setStartPageIndex(currentPageNo);
      reportConfig.setEndPageIndex(currentPageNo);
      if((currentPageNo + 1) < totalPageCount) {
        StringBuilder sb = new StringBuilder();
        sb.append("<div>");
        sb.append("[ Page: " + (currentPageNo + 1) + " of " + totalPageCount + " ] ");
        sb.append("<a style=\"font-family:Tahoma;color:#0000FF;\" href=\"?pageNo=");
        sb.append((currentPageNo + 2));
        sb.append("\">Next Page</a></div><br /><br /><br />");
        sb.append("</td><td width=\"50%\">&nbsp;</td></tr>");
        sb.append("</table>");
        sb.append("</body");
        sb.append("</html>");
        htmlExporterConfiguration.setHtmlFooter(sb.toString());
      }
    }
    //default zoom
    reportConfig.setZoomRatio(2.0f);

    final Exporter exporter = new HtmlExporter();
    final ByteArrayOutputStream out = new ByteArrayOutputStream();
    exporter.setExporterOutput(new SimpleHtmlExporterOutput(out));
    exporter.setExporterInput(new SimpleExporterInput(jasperPrint));


    exporter.setConfiguration(reportConfig);
    exporter.setConfiguration(htmlExporterConfiguration);

    exporter.exportReport();
    return  new String(out.toByteArray());
  }
}