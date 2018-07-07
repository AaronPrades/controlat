package io.aaronprades.controlat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.aaronprades.controlat.domain.Aula;
import io.aaronprades.controlat.dto.AulaDTO;
import io.aaronprades.controlat.mapper.AulaMapper;
import io.aaronprades.controlat.repository.AulaRepository;
import io.aaronprades.controlat.service.AulaService;

@Service
@Transactional
public class AulaServiceImpl implements AulaService {

	@Autowired
	private AulaRepository aulaRepository;
	
	@Autowired
	private AulaMapper aulaMapper;
	
	@Override
	public List<AulaDTO> listarAulas() {
		List<Aula> aulas = aulaRepository.findAll();
		return aulaMapper.listaAulaToListaAulaDTO(aulas);
	}

}
