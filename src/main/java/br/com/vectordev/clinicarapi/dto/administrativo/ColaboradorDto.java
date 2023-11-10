package br.com.vectordev.clinicarapi.dto.administrativo;

import br.com.vectordev.clinicarapi.modelo.administrativo.Cargo;
import br.com.vectordev.clinicarapi.modelo.administrativo.TipoColaborador;
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
public class ColaboradorDto {
	
	private Long id;
	
	private String nome;
	
	private TipoColaborador tipoColaborador;
	
	private Cargo cargo;

}
