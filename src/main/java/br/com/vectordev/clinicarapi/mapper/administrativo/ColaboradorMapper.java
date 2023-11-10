package br.com.vectordev.clinicarapi.mapper.administrativo;

import br.com.vectordev.clinicarapi.dto.administrativo.ColaboradorDto;
import br.com.vectordev.clinicarapi.modelo.administrativo.Colaborador;

public class ColaboradorMapper {

	public static Colaborador fromDtoToEntity(ColaboradorDto dto) {
		return Colaborador.builder()
				.id(dto.getId())
				.nome(dto.getNome())
				.tipoColaborador(dto.getTipoColaborador())
				.cargo(dto.getCargo())
				.build();
				
				
	}
}
