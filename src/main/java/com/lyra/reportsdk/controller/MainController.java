package com.lyra.reportsdk.controller;

import com.lyra.reportsdk.entity.Customer;
import com.lyra.reportsdk.entity.Transaction;
import com.lyra.reportsdk.service.ReportService;
import com.lyra.reportsdk.service.CustomerService;
import com.lyra.reportsdk.service.TransactionService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class MainController {

  @Autowired
  private CustomerService customerService;

  @Autowired
  private TransactionService transactionService;

  @Autowired
  private ReportService reportService;

  @RequestMapping("/")
  public String index() {
    return "Lyra Report SDK";
  }

  @GetMapping("/customers")
  public List<Customer> getCustomers(){
    return customerService.getAll();
  }

  @GetMapping("/transactions")
  public List<Transaction> getTransactions(){
    return transactionService.getAll();
  }

  @GetMapping("/report/customers")
  public String generateCustomerReport(@RequestParam(name = "pageNo", required = false) String pageNo)
    throws FileNotFoundException, JRException {
    return customerService.getReport(pageNo);
  }

  @GetMapping("/report/transactions")
  public String generateTransactionReport(@RequestParam(name = "pageNo", required = false) String pageNo)
    throws FileNotFoundException, JRException  {
    return transactionService.getReport(pageNo);
  }
}