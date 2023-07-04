package com.social.client.common;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ApiHelper {

   private final RestTemplate restTemplate;
    public  <T> T makeApiCall(String url, HttpMethod method, Object payload, String token, Class<T> responseType){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
//        if (StringUtils.hasLength(token)) {
//            validateToken(token,headers,request,response);
//        }
        HttpEntity<Object> requestEntity = new HttpEntity<>(payload, headers);
        ResponseEntity<T> responseEntity = restTemplate.exchange(url, method, requestEntity, responseType);
        return responseEntity.getBody();
    }

    public  <T> List<T> makeApiCall(String url, HttpMethod method, Object payload, String token, ParameterizedTypeReference<List<T>> responseType)  {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
//        if (StringUtils.hasLength(token)) {
//            validateToken(token,headers,request,response);
//        }
        HttpEntity<Object> requestEntity = new HttpEntity<>(payload, headers);
        ResponseEntity<List<T>> responseEntity = null;
        responseEntity = restTemplate.exchange(url, method, requestEntity, responseType);
        return responseEntity.getBody();
    }
}
