package br.com.vectordev.clinicarapi.services.impl.administrativo;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.vectordev.clinicarapi.dto.administrativo.TipoColaboradorDto;
import br.com.vectordev.clinicarapi.exceptions.BadRequestException;
import br.com.vectordev.clinicarapi.exceptions.NotFoundException;
import br.com.vectordev.clinicarapi.mapper.administrativo.TipoColaboradorMapper;
import br.com.vectordev.clinicarapi.modelo.administrativo.TipoColaborador;
import br.com.vectordev.clinicarapi.repositories.administrativo.ITipoColaboradorRepository;
import br.com.vectordev.clinicarapi.services.administrativo.ITipoColaboradorService;

@Service
public class TipoColaboradorServiceImpl implements ITipoColaboradorService {

	private final ITipoColaboradorRepository repositorio;
	
	public TipoColaboradorServiceImpl(ITipoColaboradorRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<TipoColaborador> obterTodos() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}

	@Override
	public TipoColaborador obterPeloId(Long id) {
		// TODO Auto-generated method stub
		return getPeloId(id);
	}

	@Override
	public TipoColaborador salvar(TipoColaboradorDto dto) {
		// TODO Auto-generated method stub
		
		if (Objects.nonNull(getPeloId(dto.getId()))) {		
			throw new BadRequestException("Já existe um registro para esse Id!");
		}		
		
		return this.repositorio.save(TipoColaboradorMapper.fromDtoToEntity(dto));
	}

	@Override
	public TipoColaborador atualizar(TipoColaboradorDto dto, Long id) {
		// TODO Auto-generated method stub
		
		TipoColaborador tipoColaborador = getPeloId(id);
		
		if (Objects.isNull(tipoColaborador)) {
			throw new BadRequestException("Não encontrado tipo de colaborador para o id informado!");
		}
		
		dto.setId(tipoColaborador.getId());
		
		return this.repositorio.save(TipoColaboradorMapper.fromDtoToEntity(dto));
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
		if (Objects.isNull(getPeloId(id))) {
			throw new BadRequestException("Registro não encontrado!");
		}
		
		this.repositorio.deleteById(id);

	}
	
	private TipoColaborador getPeloId(Long id) {
		
		Optional <TipoColaborador> tipoColaborador = this.repositorio.findById(id);
		
		if (tipoColaborador.isEmpty()) {
			throw new NotFoundException("Tipo Colaborador não encontrado!");
		}
		
		return tipoColaborador.get();
	}

}
