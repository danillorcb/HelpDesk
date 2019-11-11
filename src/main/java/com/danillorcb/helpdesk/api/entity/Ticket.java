package com.danillorcb.helpdesk.api.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ticket {

	@Id
	private String id;
	
	@DBRef(lazy = true)
	private User user;
	
	private Date date;
	
	private String title;
	
	private Integer number;
	
	private enum... status;
	
	private enum... priority;
	
	@DBRef(lazy = true)
	private User assignedUser;
	
	private String description;
	
	private String image;
	
	private list... changes;
}
