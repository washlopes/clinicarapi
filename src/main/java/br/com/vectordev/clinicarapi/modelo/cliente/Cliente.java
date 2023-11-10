package br.com.vectordev.clinicarapi.modelo.cliente;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_clientes", schema="cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = -3396990482834115202L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "t_clientes_codigo_seq")
	@SequenceGenerator(name = "t_clientes_codigo_seq", sequenceName = "t_clientes_codigo_seq", schema = "cliente", allocationSize = 1)
	private Long codigo;
	
	private String nome;
	
	private Integer cpf;
	
	@Enumerated(EnumType.STRING)
	private Cor cor;
	
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;
	
	@Enumerated(EnumType.STRING)
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
	
	// private Integer convenioId;
	
	/* @ManyToOne
	@JoinColumn(name="convenio_id", nullable = true)
	private Convenio convenio; */

}
