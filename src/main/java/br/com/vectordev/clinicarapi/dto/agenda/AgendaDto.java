package br.com.vectordev.clinicarapi.dto.agenda;

import java.time.LocalDate;
import java.time.LocalTime;

import br.com.vectordev.clinicarapi.modelo.administrativo.Colaborador;
import br.com.vectordev.clinicarapi.modelo.cliente.Cliente;
import br.com.vectordev.clinicarapi.modelo.cliente.Convenio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class AgendaDto {

	private Long id;
	
	private LocalDate dataAgendamento;
	
	private LocalTime horaAgendamento;
	
	private Cliente cliente;
	
	private Colaborador colaborador;
	
	private Convenio convenio;
	
}
