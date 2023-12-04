package br.com.vectordev.clinicarapi.services.impl.cliente;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.vectordev.clinicarapi.dto.cliente.ClienteDto;
import br.com.vectordev.clinicarapi.exceptions.BadRequestException;
import br.com.vectordev.clinicarapi.exceptions.NotFoundException;
import br.com.vectordev.clinicarapi.mapper.cliente.ClienteMapper;
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
	public List <Cliente> findByNome(String nome) {
		// TODO Auto-generated method stub
		return getClientePeloNome(nome);
	}

	@Override
	public Cliente findByCpf(Long cpf) {
		// TODO Auto-generated method stub
		return getClientePeloCpf(cpf);
	}

	@Override
	public Cliente salvar(ClienteDto dto) {
		// TODO Auto-generated method stub
		if (!Objects.isNull(dto.getCodigo())) {
			throw new BadRequestException("O código não deve ser informado no cadastro do cliente!");
		}
		return repositorio.save(ClienteMapper.fromDtoToEntity(dto));
	}

	@Override	
	public Cliente atualizar(ClienteDto dto, Long codigo) {
		// TODO Auto-generated method stub
		
		Cliente cliente = getClientePeloCodigo(codigo);
		
		dto.setCodigo(cliente.getCodigo());
		
		return repositorio.save(ClienteMapper.fromDtoToEntity(dto));		
		
	}

	@Override
	public void excluir(Long codigo) {
		// TODO Auto-generated method stub
		repositorio.deleteById(getClientePeloCodigo(codigo).getCodigo());

	}
	
	private Cliente getClientePeloCodigo(Long codigo) {
		Optional <Cliente> cliente = repositorio.findById(codigo);
		
		if (cliente.isEmpty()) {
			throw new NotFoundException("Cliente não encontrado!");
		}
		
		return cliente.get();
	}
	
	private List <Cliente> getClientePeloNome(String nome) {
		List <Cliente> clientes = repositorio.findByName(nome);
		
		if (clientes.isEmpty()) {
			throw new NotFoundException("Cliente não encontrado!");
		}
		
		return clientes;
	}
	
	private Cliente getClientePeloCpf(Long cpf) {
		Optional <Cliente> cliente = repositorio.findById(cpf);
		
		if (cliente.isEmpty()) {
			throw new NotFoundException("Cliente não encontrado!");
		}
		
		return cliente.get();
	}

}
