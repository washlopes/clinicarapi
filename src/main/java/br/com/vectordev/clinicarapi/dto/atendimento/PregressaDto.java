package br.com.vectordev.clinicarapi.dto.atendimento;

import br.com.vectordev.clinicarapi.modelo.cliente.Cliente;
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
public class PregressaDto {
	
	private Long codigo;
		
	private Cliente cliente;
	
	private Boolean bebe;
	
	private Boolean fuma;
	
	private int gravidez;
	
	private int parto;
	
	private int aborto;
	
	private String internacao;
	
	private String cirurgia;
	
	private String patologia;
	
	private String alergia;
	
	private String medicamentos;

}
