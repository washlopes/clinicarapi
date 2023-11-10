package br.com.vectordev.clinicarapi.services.impl.administrativo;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import br.com.vectordev.clinicarapi.dto.administrativo.CargoDto;
import br.com.vectordev.clinicarapi.exceptions.BadRequestException;
import br.com.vectordev.clinicarapi.exceptions.NotFoundException;
import br.com.vectordev.clinicarapi.mapper.administrativo.CargoMapper;
import br.com.vectordev.clinicarapi.modelo.administrativo.Cargo;
import br.com.vectordev.clinicarapi.repositories.administrativo.ICargoRepository;
import br.com.vectordev.clinicarapi.services.administrativo.ICargoService;

public class CargoServiceImpl implements ICargoService {

	private final ICargoRepository repositorio;
	
	public CargoServiceImpl(ICargoRepository repositorio) {
		this.repositorio = repositorio;
	}
	
	@Override
	public List<Cargo> obterTodos() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}

	@Override
	public Cargo obterPeloId(Long id) {
		// TODO Auto-generated method stub
		return getPeloId(id);
	}

	@Override
	public Cargo salvar(CargoDto dto) {
		// TODO Auto-generated method stub
		// Cargo cargo = getPeloId(dto.getId());
		
		if (Objects.nonNull(dto.getId())) {
			throw new BadRequestException("Não informar Id no momento de cadastro de cargo!!");
		}
		
		return this.repositorio.save(CargoMapper.fromDtoToEntity(dto));
	}

	@Override
	public Cargo atualizar(CargoDto dto, Long id) {
		// TODO Auto-generated method stub
		Cargo cargo = getPeloId(id);
		
		if (Objects.isNull(cargo)) {
			throw new BadRequestException("Não existte cargo para o id informado!");
		}
		
		return this.repositorio.save(CargoMapper.fromDtoToEntity(dto));
			
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		if (Objects.isNull(getPeloId(id))) {
			throw new NotFoundException("Cargo para o id informado não encontrado!");
		}
		
		this.repositorio.deleteById(id);
	}
	
	private Cargo getPeloId(Long id) {
		
		Optional <Cargo> cargo = repositorio.findById(id);
		
		if (cargo.isEmpty()) {
			throw new NotFoundException("Cargo não encontrado!");
		}
		
		return cargo.get();
		
		
	}

}
