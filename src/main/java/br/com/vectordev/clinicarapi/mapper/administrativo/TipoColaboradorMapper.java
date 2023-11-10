package br.com.vectordev.clinicarapi.mapper.administrativo;

import br.com.vectordev.clinicarapi.dto.administrativo.TipoColaboradorDto;
import br.com.vectordev.clinicarapi.modelo.administrativo.TipoColaborador;

public class TipoColaboradorMapper {

	public static TipoColaborador fromDtoToEntity(TipoColaboradorDto dto) {
		
		return TipoColaborador.builder()
				.id(dto.getId())
				.tipoColaborador(dto.getTipoColaborador())
				.build();
	}
}
