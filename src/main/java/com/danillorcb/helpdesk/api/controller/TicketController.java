package com.danillorcb.helpdesk.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danillorcb.helpdesk.api.security.jwt.JwtTokenUtil;
import com.danillorcb.helpdesk.api.service.TicketService;
import com.danillorcb.helpdesk.api.service.UserService;

@RestController
@RequestMapping("api/ticket")
@CrossOrigin(origins = "*")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@Autowired
	protected JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private UserService userService;
	
	
//	public ResponseEntity<Response<Ticket>>
}
