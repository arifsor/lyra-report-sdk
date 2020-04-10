package com.lyra.reportsdk.service;

import com.lyra.reportsdk.entity.Customer;
import com.lyra.reportsdk.repository.CustomerRepository;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CustomerService {

  @Autowired
  private CustomerRepository customerRepository;
  @Autowired
  private ReportService reportService;

  @PostConstruct
  public void initCustomer(){
    customerRepository.saveAll(Stream.of(
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5),
        new Customer(null, "Arif", "Sorathia","Unknown","arif.sor@gmail.com","23444","Missisauga, Canada",5)
      ).collect(Collectors.toList())
    );
  }
  public List<Customer> getAll(){
    return customerRepository.findAll();
  }

  public String getReport() throws FileNotFoundException, JRException {
    final File jrxmlFile = ResourceUtils.getFile("classpath:customers.jrxml");
    List<Customer> customers = customerRepository.findAll();
    return reportService.exportReport(jrxmlFile, customers);
  }
}