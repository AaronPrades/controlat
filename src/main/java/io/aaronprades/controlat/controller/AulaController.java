package io.aaronprades.controlat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.aaronprades.controlat.dto.AulaDTO;
import io.aaronprades.controlat.form.AulaForm;
import io.aaronprades.controlat.service.AulaService;

@Controller
@RequestMapping("/aula")
public class AulaController {
	
	private static final String AULA = "/aula/crud-aula";
	
	@Autowired
	private AulaService aulaService;
	
	@GetMapping
	public String init(AulaForm aulaForm) {
		List<AulaDTO> aulas = aulaService.listarAulas();
		
		aulaForm.setAulas(aulas);
		
		return AULA;
	}
}