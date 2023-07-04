package com.social.client.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class config {
    @Value("${spring.kafka.bootstrap-servers}")
    public static String bootstrapServers;
}
