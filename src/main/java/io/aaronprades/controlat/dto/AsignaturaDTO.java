package io.aaronprades.controlat.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = { "idAsignatura" })
public class AsignaturaDTO {

	@NotNull
	private Integer idAsignatura;

	@NotNull
	@Length(max = 40)
	private String nombre;
	
	@NotNull
	private Integer horasPlanificadas;
}
