package com.pk.producer.mask;

import com.pk.producer.constants.AppConstants;
import com.pk.producer.model.CustomerProducer;

public class CustomerRequestMask {

  public CustomerProducer maskFields(CustomerProducer customer) {
    CustomerProducer maskedCustomer = new CustomerProducer();
    maskedCustomer.setCustomerNumber(
        customer.getCustomerNumber().replaceAll(AppConstants.CUSTOMER_NUMBER_MASK, "*"));
    maskedCustomer.setFirstName(customer.getFirstName());
    maskedCustomer.setLastName(customer.getLastName());
    maskedCustomer.setCountry(customer.getCountry());
    maskedCustomer.setCountryCode(customer.getCountryCode());
    maskedCustomer
        .setEmail(customer.getEmail().replaceAll(AppConstants.FIRST_FOUR_CHARS_MASK, "****"));
    maskedCustomer.setMobileNumber(customer.getMobileNumber());
    maskedCustomer.setCustomerStatus(customer.getCustomerStatus());
    maskedCustomer.setBirthDate(
        customer.getBirthDate().replaceAll(AppConstants.FIRST_FOUR_CHARS_MASK, "****"));
    maskedCustomer.setAddress(customer.getAddress());

    return maskedCustomer;
  }

}
