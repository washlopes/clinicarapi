package br.com.vectordev.clinicarapi.dto.cliente;

import java.time.LocalDate;

import br.com.vectordev.clinicarapi.modelo.cliente.Convenio;
import br.com.vectordev.clinicarapi.modelo.cliente.Cor;
import br.com.vectordev.clinicarapi.modelo.cliente.EstadoCivil;
import br.com.vectordev.clinicarapi.modelo.cliente.Sexo;
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
public class ClienteDto {

	private Long codigo;
	
	private String nome;
	
	private Integer cpf;
	
	private Cor cor;
	
	private EstadoCivil estadoCivil;
	
	private Sexo sexo;
	
	private String pai;
	
	private String mae;
	
	private LocalDate dataNascimento;
	
	private String profissao;
	
	private String indicacao;
	
	private String endereco;
	
	private Integer numero;
	
	private String complemento;
	
	private String bairro;
	
	private String municipio;
	
	private String uf;
	
	private String cep;
	
	private String telefoneResidencial;
	
	private String telefoneComercial;
	
	private String telefoneCelular;
	
	private String email;
	
	 // private Convenio convenio;
	
}
