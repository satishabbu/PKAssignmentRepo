package com.pk.producer.mask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.pk.producer.model.CustomerProducer;

public class CustomerProducerMask {

  public CustomerProducer mask(CustomerProducer customer) {
    CustomerProducer maskedCustomer = new CustomerProducer();
    maskedCustomer.setCustomerNumber(customer.getCustomerNumber());
    maskedCustomer.setFirstName(customer.getFirstName());
    maskedCustomer.setLastName(customer.getLastName());
    maskedCustomer.setCountry(customer.getCountry());
    maskedCustomer.setEmail(customer.getEmail());
    maskedCustomer.setCountryCode(customer.getCountryCode());
    maskedCustomer.setMobileNumber(customer.getMobileNumber());
    maskedCustomer.setCustomerStatus(customer.getCustomerStatus().toString());
    maskedCustomer.setBirthDate(LocalDate
        .parse(customer.getBirthDate(), DateTimeFormatter.ofPattern("ddMMyyyy")).toString());
    maskedCustomer.setAddress(customer.getAddress());

    return customer;
  }
}
