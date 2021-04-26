package com.pk.engineering.excellence.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.pk.engineering.excellence.consumer.constants.AppConstants;
 
@Service
public class ConsumerService 
{
    private final Logger logger = 
            LoggerFactory.getLogger(ConsumerService.class);
 
    @KafkaListener(topics = AppConstants.TOPIC_NAME, 
            groupId = AppConstants.GROUP_ID)
    public void consume(String message) 
    {
        logger.info("Message received from service");
        logger.info(message);
    }
}