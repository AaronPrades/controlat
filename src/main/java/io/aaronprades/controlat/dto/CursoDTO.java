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
@EqualsAndHashCode(of = { "idCurso" })
public class CursoDTO {

	@NotNull
	private Integer idCurso;

	@NotNull
	@Length(max = 40)
	private String nombre;
}
