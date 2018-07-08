package io.aaronprades.controlat.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="crt_profesor")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"idProfesor"})
public class Profesor {
	
	@Id
	@GenericGenerator(
			name = "profesorGenerator",
			strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
			parameters = {
					@Parameter(name = "sequence_name", value = "prof_seq")
			}
	)
	@GeneratedValue(generator = "profesorGenerator")
	@Column(name="id_profesor", unique = true, nullable = false)
	private Integer idProfesor;
	
	@NotNull
	@Length(max = 9)
	@Column(name = "dni")
	private String dni;
	
	@NotNull
	@Length(max = 40)
	@Column(name = "nombre")
	private String nombre;
	
	@NotNull
	@Length(max = 40)
	@Column(name = "primer_apellido")
	private String primerApellido;
	
	@Length(max = 40)
	@Column(name = "segundo_apellido")
	private String segundoApellido;
	
	@Length(max = 40)
	@Column(name = "email")
	private String email;
	
	@NotNull
	@Length(max = 9)
	@Column(name = "telefono")
	private String telefono;
}