package com.teksoi.restapi.service;

import com.teksoi.restapi.dto.Response;

public interface PostCommentService {

	Response findCommentsByBookId(Long id);
}
