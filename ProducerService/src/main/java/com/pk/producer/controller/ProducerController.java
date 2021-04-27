package com.pk.producer.controller;

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
  private final ProducerService producerService;

  @Autowired
  public ProducerController(ProducerService producerService) {
    this.producerService = producerService;
  }

  @PostMapping("/publish")
  public void sendMessageToKafkaTopic(@RequestBody Customer customer) {
    this.producerService.sendMessage(customer);
  }
}
