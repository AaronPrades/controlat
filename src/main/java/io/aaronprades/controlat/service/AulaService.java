package io.aaronprades.controlat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.aaronprades.controlat.dto.AulaDTO;

@Service
public interface AulaService {

	public List<AulaDTO> listarAulas();
}
