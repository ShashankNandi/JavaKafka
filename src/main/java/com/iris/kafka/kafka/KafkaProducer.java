package com.iris.kafka.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;


@Service
public class KafkaProducer {

    KafkaTemplate<String, String> kafkaTemplate;

    Logger logger = Logger.getLogger(KafkaProducer.class.getName());

    @Autowired
    public void setKafkaTemplate(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topic, String message) {
        logger.info("Sending message: " + message);
        kafkaTemplate.send(topic, message);
    }
}
