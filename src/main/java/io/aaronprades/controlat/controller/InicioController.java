package io.aaronprades.controlat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class InicioController extends BaseController {
	
	private static final String INDEX = "/index";
	
	@GetMapping
	public String initForm() {
		return INDEX;
	}	
}