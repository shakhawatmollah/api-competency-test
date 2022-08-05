package com.teksoi.restapi.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teksoi.restapi.dto.Response;
import com.teksoi.restapi.service.PostCommentService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PostCommentController {
	
	@Autowired
	PostCommentService postCommentService;
	
	@GetMapping("/comments/{id}")
    @ResponseBody
    public Response findCommentListByBookId(@PathVariable("id") Long id, HttpServletResponse httpServletResponse) {
        Response response = postCommentService.findCommentsByBookId(id);
        httpServletResponse.setStatus(response.getStatusCode());
        return response;
    }

}
