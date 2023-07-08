package com.social.client.entities;

import java.sql.Timestamp;

public class Posts {
    private String id;
    private String content;
    private String postOwner;
    private String privacyStatus;
    private Timestamp postedAt;
    private Timestamp updateAt;
    private Boolean isDeleted;
}
