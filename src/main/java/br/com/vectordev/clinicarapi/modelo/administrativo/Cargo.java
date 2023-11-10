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
@Table(name="t_cargos", schema="administrativo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class Cargo implements Serializable {

	private static final long serialVersionUID = -6847719437116831150L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "t_cargos_id_seq")
	@SequenceGenerator(name="t_cargos_id_seq", sequenceName = "t_cargos_id_seq", schema = "administrativo", allocationSize = 1)
	private Long id;
	
	private String cargo;
	
}
