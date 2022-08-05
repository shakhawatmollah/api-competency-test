package com.teksoi.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teksoi.restapi.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

}
