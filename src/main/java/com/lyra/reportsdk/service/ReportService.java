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
import net.sf.jasperreports.export.SimpleHtmlExporterOutput;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReportService {

  public String exportReport(File file, Collection<?> beanCollection) throws JRException {

    final JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
    final JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(beanCollection);

    final Map<String, Object> parameters = new HashMap<>();
    parameters.put("COMPANY_NAME", "ARON Inc");
    parameters.put("COMPANY_ADDRESS", "Mississauga, Ontario");
    parameters.put("COMPANY_PHONE", "36637778");
    parameters.put("COMPANY_FAX", "7878733773");
    parameters.put("POWERED_BY", "NA");
    parameters.put("SUPPORT_EMAIL", "support@lyrasdk.com");
    parameters.put("PERIOD", "Jan 1, 2020 - 31, Jan 2020");
    parameters.put("PRODUCT_NAME", "Lyra SDK");
    parameters.put("COPY_RIGHTS", "All rights reserved by LYRA Sdk");
    parameters.put("SUPPORTED_BY", "LyraSDK");
    parameters.put("SYSTEM_USER", "Arif");
    parameters.put("COMPANY_PHONE_FAX_INFO", "987766667");
    parameters.put("EMAIL_WEB", "info@abc.com");

    final JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

    final Exporter exporter = new HtmlExporter();
    final ByteArrayOutputStream out = new ByteArrayOutputStream();
    exporter.setExporterOutput(new SimpleHtmlExporterOutput(out));
    exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
    exporter.exportReport();

    return  new String(out.toByteArray());
  }
}