package br.com.vectordev.clinicarapi.services.cliente;

import java.util.List;

import br.com.vectordev.clinicarapi.dto.cliente.ClienteDto;
import br.com.vectordev.clinicarapi.modelo.cliente.Cliente;

public interface IClienteService {
	
	List <Cliente> retornarTodas();
	
	Cliente findByCodigo(Long codigo);
	
	List <Cliente> findByNome(String nome);
	
	Cliente findByCpf(Long cpf);
	
	Cliente salvar(ClienteDto dto);
	
	Cliente atualizar(ClienteDto dto, Long codigo);
	
	void excluir(Long codigo);

}
