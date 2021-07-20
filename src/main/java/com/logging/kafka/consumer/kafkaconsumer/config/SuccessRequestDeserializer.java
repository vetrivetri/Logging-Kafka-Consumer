package com.logging.kafka.consumer.kafkaconsumer.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.logging.kafka.consumer.kafkaconsumer.dto.SuccessRequestLog;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class SuccessRequestDeserializer implements Deserializer<SuccessRequestLog> {

    @Override
    public SuccessRequestLog deserialize(String arg0, byte[] devBytes) {
        ObjectMapper mapper = new ObjectMapper();
        SuccessRequestLog successRequestLog = null;
        try {
            successRequestLog = mapper.readValue(devBytes, SuccessRequestLog.class);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return successRequestLog;
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub

    }

    @Override
    public void configure(Map<String, ?> arg0, boolean arg1) {
        // TODO Auto-generated method stub

    }
}
