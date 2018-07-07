package io.aaronprades.controlat.form;

import java.util.List;

import javax.validation.Valid;

import io.aaronprades.controlat.dto.AulaDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AulaForm extends BaseForm {
	
	@Valid
	private AulaDTO aula;
	private List<AulaDTO> aulas;
}
