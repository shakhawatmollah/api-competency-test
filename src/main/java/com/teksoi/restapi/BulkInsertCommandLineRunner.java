package com.teksoi.restapi;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.teksoi.restapi.model.Book;
import com.teksoi.restapi.model.BookPost;
import com.teksoi.restapi.model.PostComment;
import com.teksoi.restapi.repository.BookPostRepository;
import com.teksoi.restapi.repository.BookRepository;
import com.teksoi.restapi.repository.PostCommentRepository;

@Component
public class BulkInsertCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookPostRepository bookPostRepository;
	
	@Autowired
	private PostCommentRepository postCommentRepository;

	@Override
	public void run(String... args) throws Exception {

		Book book = new Book();
		book.setActive(true);
		book.setBookTitle("Head First Java");
		book.setBookAuther("Kathy Sierra & Bert Bates");
		book.setCreatedAt(new Date());
		bookRepository.save(book);
		
		Book book1 = new Book();
		book1.setActive(true);
		book1.setBookTitle("Java for Dummies");
		book1.setBookAuther("Barry A. Burd");
		book1.setCreatedAt(new Date());
		bookRepository.save(book1);
		
		BookPost bookPost = new BookPost();
		bookPost.setBook(book);
		bookPost.setActive(true);
		bookPost.setPostedAt(new Date());
		bookPost.setPostText("Java for Dummies is a great beginner’s guide to Java programming that teaches you how to create basic Java objects and when you should simply reuse existing code.");
		bookPostRepository.save(bookPost);
		
		PostComment postComment = new PostComment();
		postComment.setActive(true);
		postComment.setBookPost(bookPost);
		postComment.setComment("I bought the book Java: Head First Java. An excelent book for all the Java’s novels.");
		postComment.setUserName("Abul Hasnat");
		postComment.setCommentAt(new Date());
		postCommentRepository.save(postComment);
		
		PostComment postComment1 = new PostComment();
		postComment1.setActive(true);
		postComment1.setBookPost(bookPost);
		postComment1.setComment("One of my favorite book.");
		postComment1.setUserName("Murad Hossain");
		postComment1.setCommentAt(new Date());
		postCommentRepository.save(postComment1);
		
		PostComment postComment2 = new PostComment();
		postComment2.setActive(true);
		postComment2.setBookPost(bookPost);
		postComment2.setComment("I am a java developer. And the book is helping me to understand better");
		postComment2.setUserName("Yousuf Alam");
		postComment2.setCommentAt(new Date());
		postCommentRepository.save(postComment2);
	}

}
