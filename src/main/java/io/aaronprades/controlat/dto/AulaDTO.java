package io.aaronprades.controlat.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of={"idAula"})
public class AulaDTO {
	
	@NotNull
	private Integer idAula;
	
	@NotNull
	@Length(max = 4)
	private String numero_aula;
	
	@NotNull
	private Integer max_alumnos;
}