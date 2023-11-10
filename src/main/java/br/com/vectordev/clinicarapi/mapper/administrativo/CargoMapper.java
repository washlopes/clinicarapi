package br.com.vectordev.clinicarapi.mapper.administrativo;

import br.com.vectordev.clinicarapi.dto.administrativo.CargoDto;
import br.com.vectordev.clinicarapi.modelo.administrativo.Cargo;

public class CargoMapper {

	public static Cargo fromDtoToEntity(CargoDto dto) {
		return Cargo.builder()
				.id(dto.getId())
				.cargo(dto.getCargo())
				.build();
	}
}
