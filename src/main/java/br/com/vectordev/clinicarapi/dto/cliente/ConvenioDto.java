package br.com.vectordev.clinicarapi.dto.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class ConvenioDto {

	private Long id;
	
	private String nome;
	
	private Integer codigoSusep;
	
}
