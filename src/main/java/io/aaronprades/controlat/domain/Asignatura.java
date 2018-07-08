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
@Table(name="crt_asignatura")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"idAsignatura"})
public class Asignatura {
	
	@Id
	@GenericGenerator(
			name = "asignaturaGenerator",
			strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
			parameters = {
					@Parameter(name = "sequence_name", value = "asig_seq")
			}
	)
	@GeneratedValue(generator = "asignaturaGenerator")
	@Column(name="id_asignatura", unique = true, nullable = false)
	private Integer idAsignatura;
	
	@NotNull
	@Length(max = 40)
	@Column(name = "nombre")
	private String nombre;
	
	@NotNull
	@Column(name = "horas_planificadas")
	private Integer horasPlanificadas;
}
