package com.pk.engineering.excellence.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pk.engineering.excellence.producer.model.Customer;
import com.pk.engineering.excellence.producer.service.ProducerService;

@RestController
@RequestMapping("/kafkaproducer")
public class ProducerController {
  private final ProducerService producerService;

  @Autowired
  public ProducerController(ProducerService producerService) {
    this.producerService = producerService;
  }

  @PostMapping("/publish")
  public void sendMessageToKafkaTopic(@RequestParam("message") Customer customer) {
    this.producerService.sendMessage(customer);
  }
}
