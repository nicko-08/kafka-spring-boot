package com.rodavia.kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    // Listens to messages from "rodavia-topic"
    @KafkaListener(
            topics = "rodavia-topic",
            groupId = "rodavia-group"
    )
    public void consume(String message) {
        LOGGER.info("Message received -> {}", message);
    }
}
