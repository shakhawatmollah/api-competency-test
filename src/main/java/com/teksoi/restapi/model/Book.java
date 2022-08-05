package com.teksoi.restapi.model;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class Book extends BaseModel {

	private String bookTitle;

	private String bookAuther;
}
