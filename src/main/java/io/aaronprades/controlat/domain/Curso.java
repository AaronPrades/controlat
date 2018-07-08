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
@Table(name="crt_curso")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"idCurso"})
public class Curso {
	
	@Id
	@GenericGenerator(
			name = "cursoGenerator",
			strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
			parameters = {
					@Parameter(name = "sequence_name", value = "curso_seq")
			}
	)
	@GeneratedValue(generator = "cursoGenerator")
	@Column(name="id_curso", unique = true, nullable = false)
	private Integer idCurso;
	
	@NotNull
	@Length(max = 40)
	@Column(name = "nombre")
	private String nombre;
}
