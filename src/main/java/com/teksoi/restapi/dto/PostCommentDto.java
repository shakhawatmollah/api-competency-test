package com.teksoi.restapi.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PostCommentDto {
    private String bookTitle;
	private String bookAuther;
    private String userName;
    private String commentAt;
    private String postText;
    private String comment;
}
