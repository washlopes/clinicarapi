package br.com.vectordev.clinicarapi.services.impl.cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.vectordev.clinicarapi.dto.cliente.ConvenioDto;
import br.com.vectordev.clinicarapi.modelo.cliente.Convenio;
import br.com.vectordev.clinicarapi.repositories.cliente.IConvenioRepository;
import br.com.vectordev.clinicarapi.services.cliente.IConvenioService;

@Service
public class ConvenioServiceImpl implements IConvenioService {

	private final IConvenioRepository repositorio;
	
	ConvenioServiceImpl(IConvenioRepository repositorio) {
		this.repositorio = repositorio;
	}
	
	@Override
	public List<Convenio> obterTodos() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Convenio obterPeloId(Long id) {
		// TODO Auto-generated method stub
		return obterConvenioPeloId(id);
	}

	@Override
	public Convenio obterPeloNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Convenio obterPeloCodigoSusep(Integer codigoSusep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Convenio salvar(ConvenioDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Convenio atualizar(ConvenioDto dto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub

	}
	
	private Convenio obterConvenioPeloId(Long id) {
		
		Optional <Convenio> convenio = repositorio.findById(id);
		
		if (convenio.isEmpty()) {
			throw new RuntimeException("Convênio não encontrado!");
		}
		
		return convenio.get();
		
	}

}
