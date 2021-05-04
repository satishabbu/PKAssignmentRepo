package com.pk.producer.controller;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pk.producer.model.Customer;
import com.pk.producer.service.ProducerService;

@RestController
@RequestMapping("/kafkaproducer")
public class ProducerController {
  private static final Logger logger = LoggerFactory.getLogger(ProducerController.class);
  private final ProducerService producerService;

  @Autowired
  public ProducerController(ProducerService producerService) {
    this.producerService = producerService;
  }

  @PostMapping("/publish")
  public void sendMessageToKafkaTopic(@Valid @RequestBody Customer customer) {
    logger.debug("Sending message {} to kafka", customer);
    this.producerService.sendMessage(customer);
    logger.debug("Message sent successfully");
  }
}
