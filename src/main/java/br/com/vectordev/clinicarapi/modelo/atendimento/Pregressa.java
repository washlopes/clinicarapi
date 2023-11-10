package br.com.vectordev.clinicarapi.modelo.atendimento;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.vectordev.clinicarapi.modelo.cliente.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_pregressa", schema = "atendimento")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class Pregressa implements Serializable {

	private static final long serialVersionUID = 7512723567063460351L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="t_pregressa_codigo_seq")
	@SequenceGenerator(name="t_pregressa_codigo_seq", sequenceName = "t_pregressa_codigo_seq", schema="atendimento", allocationSize = 1)
	private Long codigo;
	
	@OneToOne
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
