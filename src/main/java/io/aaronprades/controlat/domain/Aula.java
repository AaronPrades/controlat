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
@Table(name="crt_aula")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of={"idAula"})
public class Aula {
	
	@Id
	@GenericGenerator(
			name = "aulaGenerator",
			strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
			parameters = {
					@Parameter(name = "sequence_name", value = "aula_seq")
			}
	)
	@GeneratedValue(generator = "aulaGenerator")
	@Column(name="id_aula", unique = true, nullable = false)
	private Integer idAula;
	
	@NotNull
	@Length(max = 4)
	@Column(name = "numero_aula")
	private String numeroAula;
	
	@NotNull
	@Column(name = "max_alumnos")
	private Integer maxAlumnos;
}
