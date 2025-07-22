package com.training.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageListener {


    @KafkaListener(topics = "kafkatraining-topic5", groupId = "ConsumerGroup1")
    public void consumeMessage(String message) {

        log.info("Consumer consumed the Message : {}", message);

    }
}
