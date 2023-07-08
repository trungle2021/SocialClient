package com.social.client.entities;

import org.springframework.web.multipart.MultipartFile;

public class PostImages {
    private String imageUrl;
    private String postId;
    private int order;
    private MultipartFile file;
}
