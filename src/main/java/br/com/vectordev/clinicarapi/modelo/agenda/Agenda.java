package br.com.vectordev.clinicarapi.modelo.agenda;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.vectordev.clinicarapi.modelo.administrativo.Colaborador;
import br.com.vectordev.clinicarapi.modelo.cliente.Cliente;
import br.com.vectordev.clinicarapi.modelo.cliente.Convenio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_agenda", schema="agenda")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class Agenda implements Serializable {
	
	private static final long serialVersionUID = -671500253420762635L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="t_agenda_id_seq")
	@SequenceGenerator(name="t_agenda_id_seq", sequenceName = "t_agenda_id_seq", schema="agenda", allocationSize = 1)
	public Long id;
		
	private LocalDate dataAgendamento;
	
	private LocalTime horaAgendamento;
	
	@ManyToOne
	@JoinColumn(name="codigo_cliente", nullable = true)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="codigo_colaborador", nullable = true)
	private Colaborador colaborador;
	
	@ManyToOne
	@JoinColumn(name="codigo_convenio", nullable = true)
	private Convenio convenio;

}
