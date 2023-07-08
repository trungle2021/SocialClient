package com.social.client.dtos;

import com.social.client.entities.PostImages;
import com.social.client.entities.Posts;
import com.social.client.entities.PostTaggedUsers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {
    Posts newPost;
    List<PostImages> postImages;
    List<PostTaggedUsers> usersTaggedOfPosts;
    //list of comments
    //list of images of comments
}

