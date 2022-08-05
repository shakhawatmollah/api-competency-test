package com.teksoi.restapi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.teksoi.restapi.dto.PostCommentDto;
import com.teksoi.restapi.dto.Response;
import com.teksoi.restapi.model.PostComment;
import com.teksoi.restapi.repository.PostCommentRepository;
import com.teksoi.restapi.service.PostCommentService;
import com.teksoi.restapi.utils.ResponseBuilder;

@Service("postCommentService")
public class PostCommentServiceImpl implements PostCommentService {

	@Autowired
    PostCommentRepository toDoRepository;
    
    @Autowired
	ModelMapper modelMapper;

	@Override
	public Response findCommentsByBookId(Long id) {
        try {
        	List<PostComment> postCommentList = toDoRepository.findByBookPostBookId(id);
            List<PostCommentDto> responseDtos = new ArrayList<>();
            postCommentList.forEach(postComment -> {
            	PostCommentDto postCommentDto = modelMapper.map(postComment, PostCommentDto.class);
                responseDtos.add(postCommentDto);
            });

            return ResponseBuilder.getSuccessResponse(HttpStatus.OK, responseDtos, responseDtos.size(), "Comment list");
        } catch (NullPointerException e) {
            return ResponseBuilder.getFailResponse(HttpStatus.BAD_REQUEST, e.getMessage());
        } catch (Exception e) {
            return ResponseBuilder.getFailResponse(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
        
	}

}
