package io.aaronprades.controlat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public abstract class BaseController {
	
	@Autowired
	protected MessageSource messageSource;
	
	@Autowired
	protected HttpServletRequest request;
	
	@Autowired
	protected HttpSession session;
}
