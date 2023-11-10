package br.com.vectordev.clinicarapi.modelo.cliente;

import java.io.Serializable;

import javax.persistence.Entity;
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
@Table(name="t_convenios", schema="cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class Convenio implements Serializable {
	
	private static final long serialVersionUID = -5221372799422328027L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "t_convenios_id_seq")
	@SequenceGenerator(name="t_convenios_id_seq", sequenceName = "t_convenios_id_seq", schema = "cliente", allocationSize = 1)
	private Long id;
	
	private String nome;
	
	private Integer codigoSusep;
}
