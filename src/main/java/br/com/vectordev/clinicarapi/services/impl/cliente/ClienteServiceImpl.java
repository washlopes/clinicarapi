package br.com.vectordev.clinicarapi.services.impl.cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.vectordev.clinicarapi.dto.cliente.ClienteDto;
import br.com.vectordev.clinicarapi.modelo.cliente.Cliente;
import br.com.vectordev.clinicarapi.repositories.cliente.IClienteRepository;
import br.com.vectordev.clinicarapi.services.cliente.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {

	private final IClienteRepository repositorio;
	
	ClienteServiceImpl(IClienteRepository repositorio){
		this.repositorio = repositorio;
	}
	
	@Override
	public List<Cliente> retornarTodas() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Cliente findByCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return getClientePeloCodigo(codigo);
	}

	@Override
	public Cliente findByNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findByCpf(Integer cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente salvar(ClienteDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente atualizar(ClienteDto dto, Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Long codigo) {
		// TODO Auto-generated method stub

	}
	
	private Cliente getClientePeloCodigo(Long codigo) {
		Optional <Cliente> cliente = repositorio.findById(codigo);
		
		if (cliente.isEmpty()) {
			throw new RuntimeException("Cliente não encontrado!");
		}
		
		return cliente.get();
	}

}
