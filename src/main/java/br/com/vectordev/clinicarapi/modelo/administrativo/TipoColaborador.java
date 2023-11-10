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
@Table(name="t_tipos_colaboradores", schema="administrativo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class TipoColaborador implements Serializable {

	private static final long serialVersionUID = 3557759232745084021L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="t_tipos_colaboradores_id_seq")
	@SequenceGenerator(name="t_tipos_colaboradores_id_se", sequenceName = "t_tipos_colaboradores_id_se", schema="administrativo", allocationSize = 1)
	private Long id;
	
	private String tipoColaborador;
}
