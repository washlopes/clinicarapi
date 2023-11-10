package br.com.vectordev.clinicarapi.mapper.agenda;

import br.com.vectordev.clinicarapi.dto.agenda.AgendaDto;
import br.com.vectordev.clinicarapi.modelo.agenda.Agenda;

public class AgendaMapper {

	public static Agenda fromDtoToEntity(AgendaDto dto) {
		return Agenda.builder()
				.id(dto.getId())
				.dataAgendamento(dto.getDataAgendamento())
				.horaAgendamento(dto.getHoraAgendamento())
				.cliente(dto.getCliente())
				.colaborador(dto.getColaborador())
				.convenio(dto.getConvenio())
				.build();
				
	}
}
