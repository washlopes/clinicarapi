package br.com.vectordev.clinicarapi.services.agenda;

import java.util.List;

import br.com.vectordev.clinicarapi.dto.administrativo.ColaboradorDto;
import br.com.vectordev.clinicarapi.dto.agenda.AgendaDto;
import br.com.vectordev.clinicarapi.modelo.agenda.Agenda;

public interface IAgendaService {
	
	List <Agenda> obterTodos();
	
	Agenda obterPeloId(Long id);
	
	List <Agenda> obterPeloColaborador(ColaboradorDto dto);
	
	Agenda salvar(AgendaDto dto);
	
	Agenda atualizar(AgendaDto dto, Long id);
	
	void excluir(Long id);

}
