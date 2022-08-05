package com.teksoi.restapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class PostComment extends BaseModel {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date commentAt;
    
    private String comment;
    
    private String userName;
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_post_id")
	private BookPost bookPost;
}
