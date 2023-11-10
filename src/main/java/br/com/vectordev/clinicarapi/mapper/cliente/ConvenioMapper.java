package br.com.vectordev.clinicarapi.mapper.cliente;

import br.com.vectordev.clinicarapi.dto.cliente.ConvenioDto;
import br.com.vectordev.clinicarapi.modelo.cliente.Convenio;

public class ConvenioMapper {

	public static Convenio fromDtoToEntity(ConvenioDto dto) {
		return Convenio.builder()
		.id(dto.getId())
		.nome(dto.getNome())
		.codigoSusep(dto.getCodigoSusep())
		.build();
	}
	
}
