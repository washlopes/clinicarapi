package br.com.vectordev.clinicarapi.dto.administrativo;

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
public class TipoColaboradorDto {

private Long id;
	
	private String tipoColaborador;
	
}
