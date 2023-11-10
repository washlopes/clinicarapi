package br.com.vectordev.clinicarapi.mapper.atendimento;

import java.time.LocalDate;

import br.com.vectordev.clinicarapi.dto.atendimento.AtendimentoDto;
import br.com.vectordev.clinicarapi.modelo.atendimento.Atendimento;

public class AtendimentoMapper {
	
	public static Atendimento fromDtoToEntity(AtendimentoDto dto) {
		return Atendimento.builder()
				.codigo(dto.getCodigo())
				.cliente(dto.getCliente())
				.convenio(dto.getConvenio())
				.dataAtendimento(LocalDate.now())
				.historico(dto.getHistorico())
				.acompanhante(dto.getAcompanhante())
				.build();

	}

}
