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
@EqualsAndHashCode(of = { "idProfesor" })
public class ProfesorDTO {

	@NotNull
	private Integer idProfesor;

	@NotNull
	@Length(max = 9)
	private String dni;

	@NotNull
	@Length(max = 40)
	private String nombre;

	@NotNull
	@Length(max = 40)
	private String primerApellido;

	@Length(max = 40)
	private String segundoApellido;

	@Length(max = 40)
	private String email;

	@NotNull
	@Length(max = 9)
	private String telefono;
}