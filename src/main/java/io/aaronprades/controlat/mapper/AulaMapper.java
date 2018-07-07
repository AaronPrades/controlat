package io.aaronprades.controlat.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import io.aaronprades.controlat.domain.Aula;
import io.aaronprades.controlat.dto.AulaDTO;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AulaMapper {
	
	List<AulaDTO> listaAulaToListaAulaDTO(List<Aula> aulas);
	
	Aula aulaDTOToAula(AulaDTO aulaDTO);
	
	AulaDTO aulaToAulaDTO(Aula aula);
}
