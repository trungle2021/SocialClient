package com.example.socialclient.controller;

import com.example.socialclient.common.ApiHelper;
import com.example.socialclient.entities.FriendRequest;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final ApiHelper apiHelper;
    @GetMapping("/login")
    @KafkaListener(topics = "FriendRequest",groupId = "FriendRequest")
    public String login( FriendRequest request){
//        Gson gson = new Gson();
//        FriendRequest request = gson.fromJson(data,FriendRequest.class);
//        System.out.printf("Received a new friend request of %s and %s%n",request.getUserId(),request.getPartnerId());
        return "home";
    }
}
