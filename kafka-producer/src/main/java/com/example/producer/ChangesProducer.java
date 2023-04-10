package com.example.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChangesProducer {

    private static final Logger logger = LoggerFactory.getLogger(ChangesProducer.class);

    private static final String TOPIC = "topic1";

    private KafkaTemplate<String, String> kafkaTemplate;

    public ChangesProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String message) {
        logger.info(String.format("#### -> Producing message -> %s", message));


    }
}
