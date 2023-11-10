package br.com.vectordev.clinicarapi.services.agenda;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import br.com.vectordev.clinicarapi.dto.administrativo.ColaboradorDto;
import br.com.vectordev.clinicarapi.dto.agenda.AgendaDto;
import br.com.vectordev.clinicarapi.exceptions.BadRequestException;
import br.com.vectordev.clinicarapi.exceptions.NotFoundException;
import br.com.vectordev.clinicarapi.mapper.administrativo.ColaboradorMapper;
import br.com.vectordev.clinicarapi.mapper.agenda.AgendaMapper;
import br.com.vectordev.clinicarapi.modelo.administrativo.Colaborador;
import br.com.vectordev.clinicarapi.modelo.agenda.Agenda;
import br.com.vectordev.clinicarapi.repositories.agenda.IAgendaRepository;

public class AgendaServiceImpl implements IAgendaService {

	private final IAgendaRepository repositorio;
		
	AgendaServiceImpl(IAgendaRepository repositorio) {
		this.repositorio = repositorio;		
	}
	@Override
	public List<Agenda> obterTodos() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}

	@Override
	public Agenda obterPeloId(Long id) {
		// TODO Auto-generated method stub
		return getPeloId(id);
	}

	@Override
	public List<Agenda> obterPeloColaborador(ColaboradorDto dto) {
		// TODO Auto-generated method stub
		return this.repositorio.findPeloColaborador(ColaboradorMapper.fromDtoToEntity(dto));
		
	}

	@Override
	public Agenda salvar(AgendaDto dto) {
		// TODO Auto-generated method stub
		
		if (Objects.nonNull(dto.getId())) {
			throw new BadRequestException("Não informar id para inserir nova agenda!");
		}		
		
		return this.repositorio.save(AgendaMapper.fromDtoToEntity(dto));
	}

	@Override
	public Agenda atualizar(AgendaDto dto, Long id) {
		// TODO Auto-generated method stub
		
		Agenda agenda = getPeloId(id);
		
		if (Objects.isNull(agenda)) {
			throw new NotFoundException("Agendamento não encontrado!");
		}
		
		dto.setId(id);		
		
		return this.repositorio.save(AgendaMapper.fromDtoToEntity(dto));
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub	
		
		this.repositorio.deleteById(getPeloId(id).getId());				

	}
	
	private Agenda getPeloId(Long id) {
		Optional <Agenda> agenda = this.repositorio.findById(id);
		
		if (agenda.isEmpty()) {
			throw new NotFoundException("Agenda não encontrada");
		}
		
		return agenda.get();
	}
	
	private List <Agenda> getPeloColaborador(Colaborador colaborador) {
		 	
		return this.repositorio.findPeloColaborador(colaborador);
	}

}
