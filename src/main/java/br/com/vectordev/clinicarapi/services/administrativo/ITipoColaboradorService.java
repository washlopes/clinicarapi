package br.com.vectordev.clinicarapi.services.administrativo;

import java.util.List;

import br.com.vectordev.clinicarapi.dto.administrativo.TipoColaboradorDto;
import br.com.vectordev.clinicarapi.modelo.administrativo.TipoColaborador;

public interface ITipoColaboradorService {
	
	List <TipoColaborador> obterTodos();
	
	TipoColaborador obterPeloId(Long id);
	
	TipoColaborador salvar(TipoColaboradorDto dto);
	
	TipoColaborador atualizar(TipoColaboradorDto dto, Long id);
	
	void excluir(Long id);

}
