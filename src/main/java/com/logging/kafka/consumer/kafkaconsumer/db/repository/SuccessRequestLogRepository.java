package com.logging.kafka.consumer.kafkaconsumer.db.repository;

import com.logging.kafka.consumer.kafkaconsumer.db.entity.SuccessRequestLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuccessRequestLogRepository extends CrudRepository<SuccessRequestLog, Long> {
}
