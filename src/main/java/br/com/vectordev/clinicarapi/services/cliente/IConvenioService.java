package br.com.vectordev.clinicarapi.services.cliente;

import java.util.List;

import br.com.vectordev.clinicarapi.dto.cliente.ConvenioDto;
import br.com.vectordev.clinicarapi.modelo.cliente.Convenio;

public interface IConvenioService {
	
	List <Convenio> obterTodos();
	
	Convenio obterPeloId(Long id);
	
	Convenio obterPeloNome(String nome);
	
	Convenio obterPeloCodigoSusep(Integer codigoSusep);
	
	Convenio salvar(ConvenioDto dto);
	
	Convenio atualizar(ConvenioDto dto, Long id);
	
	void excluir(Long id);

}
