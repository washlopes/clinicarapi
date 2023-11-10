package br.com.vectordev.clinicarapi.services.administrativo;

import java.util.List;

import br.com.vectordev.clinicarapi.dto.administrativo.ColaboradorDto;
import br.com.vectordev.clinicarapi.modelo.administrativo.Colaborador;

public interface IColaboradorService {

	List <Colaborador> obterTodos();
	
	Colaborador obterPeloId(Long id);
	
	Colaborador salvar(ColaboradorDto dto);
	
	Colaborador atualizar(ColaboradorDto dto, Long id);
	
	void excluir(Long id);
}
