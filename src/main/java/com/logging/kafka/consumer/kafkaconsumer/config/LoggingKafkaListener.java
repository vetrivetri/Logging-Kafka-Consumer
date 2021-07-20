package com.logging.kafka.consumer.kafkaconsumer.config;

import com.logging.kafka.consumer.kafkaconsumer.db.entity.SuccessRequestLog;
import com.logging.kafka.consumer.kafkaconsumer.db.repository.SuccessRequestLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(id = "class-level", topics = "microservice-success-logging")
public class LoggingKafkaListener {

    @Autowired
    SuccessRequestLogRepository successRequestLogRepository;

    @KafkaHandler
    void listen(String message) {
        System.out.print("message from topic" +message);
      //  LOG.info("KafkaHandler[String] {}", message);
    }

    @KafkaHandler(isDefault = true)
    void listenDefault(SuccessRequestLog successRequestLog) {
       // LOG.info("KafkaHandler[Default] {}", object);
        System.out.print("message from topic" +successRequestLog.getSuccessRequest());
        successRequestLogRepository.save(successRequestLog);
    }
}
