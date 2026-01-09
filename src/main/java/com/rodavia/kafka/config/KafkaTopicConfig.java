package com.rodavia.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic createTopic() {
        return TopicBuilder.name("rodavia-topic")
                .build();
    }

    @Bean
    public NewTopic createJsonTopic() {
        return TopicBuilder.name("rodavia-topic-json")
                .build();
    }
}
