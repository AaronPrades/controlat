package io.aaronprades.controlat.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="crt_dias_laborables")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"idDiasLaborables"})
public class DiasLaborables {
	
	@Id
	@GenericGenerator(
			name = "diasLaborablesGenerator",
			strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
			parameters = {
					@Parameter(name = "sequence_name", value = "dias_seq")
			}
	)
	@GeneratedValue(generator = "diasLaborablesGenerator")
	@Column(name="id_dias_laborables", unique = true, nullable = false)
	private Integer idDiasLaborables;
	
	@NotNull
	@Column(name = "fecha")
	private Date fecha;
	
}
