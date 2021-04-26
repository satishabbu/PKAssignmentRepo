package com.pk.engineering.excellence.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.pk.engineering.excellence.producer.constants.AppConstants;
import com.pk.engineering.excellence.producer.model.Customer;

@Service
public class ProducerService {
  private static final Logger logger = LoggerFactory.getLogger(ProducerService.class);

  @Autowired
  private KafkaTemplate<String, Customer> kafkaTemplate;

  public void sendMessage(Customer customer) {
    logger.info("Sent kafka message");
    this.kafkaTemplate.send(AppConstants.TOPIC_NAME, customer);
  }
}
