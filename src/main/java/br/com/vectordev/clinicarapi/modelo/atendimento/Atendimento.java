package br.com.vectordev.clinicarapi.modelo.atendimento;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.vectordev.clinicarapi.modelo.cliente.Cliente;
import br.com.vectordev.clinicarapi.modelo.cliente.Convenio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_atendimentos", schema="atendimento")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class Atendimento implements Serializable {
	
	private static final long serialVersionUID = -4373442499037875241L;

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator="t_atendimentos_codigo_seq")
	@SequenceGenerator(name="t_atendimentos_codigo_seq", sequenceName = "t_atendimentos_codigo_seq", schema="atendimento", allocationSize =  1)
	private Long codigo;
		
	@ManyToOne
	@JoinColumn(name="codigo_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="id_convenio", nullable = true)
	private Convenio convenio;
	
	private LocalDate dataAtendimento;
	
	private String historico;
	
	private String acompanhante;

}
