package br.com.vectordev.clinicarapi.dto.atendimento;

import java.time.LocalDate;

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
public class AtendimentoDto {
	
	private Long codigo;
	
	private Cliente cliente;
	
	private Convenio convenio;
	
	private LocalDate dataAtendimento;
	
	private String historico;
	
	private String acompanhante;
}
