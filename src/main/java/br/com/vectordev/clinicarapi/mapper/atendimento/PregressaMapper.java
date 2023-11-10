package br.com.vectordev.clinicarapi.mapper.atendimento;

import br.com.vectordev.clinicarapi.dto.atendimento.PregressaDto;
import br.com.vectordev.clinicarapi.modelo.atendimento.Pregressa;

public class PregressaMapper {

	public static Pregressa fromDtoToEntity(PregressaDto dto) {
		return Pregressa.builder()
				.codigo(dto.getCodigo())
				.cliente(dto.getCliente())
				.bebe(dto.getBebe())
				.fuma(dto.getFuma())
				.gravidez(dto.getGravidez())
				.parto(dto.getParto())
				.aborto(dto.getAborto())
				.internacao(dto.getInternacao())
				.cirurgia(dto.getCirurgia())
				.patologia(dto.getPatologia())
				.alergia(dto.getAlergia())
				.medicamentos(dto.getMedicamentos())
				.build();
	}
}
