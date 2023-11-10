package br.com.vectordev.clinicarapi.services.administrativo;

import java.util.List;

import br.com.vectordev.clinicarapi.dto.administrativo.CargoDto;
import br.com.vectordev.clinicarapi.modelo.administrativo.Cargo;

public interface ICargoService {
	
	List <Cargo> obterTodos();
	
	Cargo obterPeloId(Long id);
	
	Cargo salvar(CargoDto dto);
	
	Cargo atualizar(CargoDto dto, Long id);
	
	void excluir(Long id);

}
