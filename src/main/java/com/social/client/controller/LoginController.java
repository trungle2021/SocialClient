package com.social.client.controller;

import com.social.client.entities.FriendRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    @KafkaListener(topics = "FriendRequest",groupId = "FriendRequest",containerFactory = "kafkaListenerContainerObjectFactory")
    public String login(FriendRequest request){
        System.out.printf("Received a new friend request of %s and %s%n",request.getUserId(),request.getPartnerId());
        return "home";
    }
}
