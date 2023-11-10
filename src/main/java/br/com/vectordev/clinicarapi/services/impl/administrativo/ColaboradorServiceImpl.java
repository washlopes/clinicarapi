package br.com.vectordev.clinicarapi.services.impl.administrativo;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import br.com.vectordev.clinicarapi.dto.administrativo.ColaboradorDto;
import br.com.vectordev.clinicarapi.exceptions.BadRequestException;
import br.com.vectordev.clinicarapi.exceptions.NotFoundException;
import br.com.vectordev.clinicarapi.mapper.administrativo.ColaboradorMapper;
import br.com.vectordev.clinicarapi.modelo.administrativo.Colaborador;
import br.com.vectordev.clinicarapi.repositories.administrativo.IColaboradorRepository;
import br.com.vectordev.clinicarapi.services.administrativo.IColaboradorService;

public class ColaboradorServiceImpl implements IColaboradorService {

	private final IColaboradorRepository repositorio;
	
	public ColaboradorServiceImpl(IColaboradorRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<Colaborador> obterTodos() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}

	@Override
	public Colaborador obterPeloId(Long id) {
		// TODO Auto-generated method stub
		return getPeloId(id);
	}

	@Override
	public Colaborador salvar(ColaboradorDto dto) {
		// TODO Auto-generated method stub
		// Colaborador colaborador = getPeloId(dto.getId());
		
		if (Objects.nonNull(dto.getId())) {
			throw new BadRequestException("Não informar Id no momento do cadastro de novo colaborador!!");
		}
		
		return this.repositorio.save(ColaboradorMapper.fromDtoToEntity(dto));
	}

	@Override
	public Colaborador atualizar(ColaboradorDto dto, Long id) {
		// TODO Auto-generated method stub
		
		Colaborador colaborador = getPeloId(id);
		
		if (Objects.isNull(colaborador)) {
			throw new BadRequestException("Colaborador não encontado para o id informado!");
		}
		
		dto.setId(colaborador.getId());
		
		return this.repositorio.save(ColaboradorMapper.fromDtoToEntity(dto));
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		if (Objects.isNull(getPeloId(id))) {
			throw new BadRequestException("Não encontrado colaborador para o id informado!");
		}
		
		this.repositorio.deleteById(id);
	}
	
	private Colaborador getPeloId(Long id) {
		
		Optional <Colaborador> colaborador = this.repositorio.findById(id);
		
		if (colaborador.isEmpty()) {
			throw new NotFoundException("Colaborador não encontrado!");
		}
		
		return colaborador.get();
	}

}
