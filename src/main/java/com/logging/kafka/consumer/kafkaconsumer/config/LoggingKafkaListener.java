package com.logging.kafka.consumer.kafkaconsumer.config;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(id = "class-level", topics = "microservice-success-logging")
public class LoggingKafkaListener {

    @KafkaHandler
    void listen(String message) {
        System.out.print("message from topic" +message);
      //  LOG.info("KafkaHandler[String] {}", message);
    }

    @KafkaHandler(isDefault = true)
    void listenDefault(Object object) {
       // LOG.info("KafkaHandler[Default] {}", object);
        System.out.print("message from topic" +object);
    }
}
