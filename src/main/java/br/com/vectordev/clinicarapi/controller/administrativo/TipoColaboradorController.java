package br.com.vectordev.clinicarapi.controller.administrativo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.vectordev.clinicarapi.modelo.administrativo.TipoColaborador;
import br.com.vectordev.clinicarapi.services.administrativo.ITipoColaboradorService;

@RestController
public class TipoColaboradorController {

	@Autowired
	private ITipoColaboradorService service;
	
	@GetMapping("/tiposcolaboradores")
	public List <TipoColaborador> obterTodos() {
		return service.obterTodos();
	}
	
	@GetMapping("/tiposcolaboradores/{id}")
	public TipoColaborador obterPeloId(@PathVariable Long id) {
		return service.obterPeloId(id);
	}
	
	
}
