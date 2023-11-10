package br.com.vectordev.clinicarapi.modelo.administrativo;

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
@Table(name="t_colaboradores", schema="administrativo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class Colaborador implements Serializable {

	private static final long serialVersionUID = 8447062547736570056L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="t_")
	@SequenceGenerator(name="", sequenceName = "", schema="administrativo", allocationSize=1)
	private Long id;
	
	private String nome;
	
	private TipoColaborador tipoColaborador;
	
	private Cargo cargo;
}
