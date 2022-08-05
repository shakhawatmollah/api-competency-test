package com.teksoi.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teksoi.restapi.model.BookPost;

@Repository
public interface BookPostRepository extends CrudRepository<BookPost, Long>{

}
