package io.aaronprades.controlat.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = { "idDiasLaborables" })
public class DiasLaborablesDTO {

	@NotNull
	private Integer idDiasLaborables;

	@NotNull
	private Date fecha;
}
