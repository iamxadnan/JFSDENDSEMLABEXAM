package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.service.CommentsSerivce;

@RestController
@RequestMapping("/")
public class CommentsController {
	
	@Autowired
	private CommentsSerivce commentsSerivce;
	
	@GetMapping("/")
	public String home()
	{
		return "<h1>Type /viewallcomments in the url</h1>" ;
	}
	
	@GetMapping("/viewallcomments")
	public List<Object> viewallComments() {
		return commentsSerivce.viewallComments();
	}
}
