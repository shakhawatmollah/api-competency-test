package com.teksoi.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teksoi.restapi.model.PostComment;

@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, Long>{

	List<PostComment> findByBookPostBookId(Long id);
	
}
