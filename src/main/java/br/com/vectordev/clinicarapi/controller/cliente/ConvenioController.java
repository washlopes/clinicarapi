package br.com.vectordev.clinicarapi.controller.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.vectordev.clinicarapi.modelo.cliente.Convenio;
import br.com.vectordev.clinicarapi.services.cliente.IConvenioService;

@RestController
public class ConvenioController {

	@Autowired
	private IConvenioService convenioService;
	
	@GetMapping("/convenios")
	public ResponseEntity <List <Convenio>>	 obterTodos() {
		return ResponseEntity.status(HttpStatus.OK)
				.body(convenioService.obterTodos());
	}
	
	@GetMapping("/convenios/{id}")
	public ResponseEntity <Convenio> obterPeloId(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(convenioService.obterPeloId(id));
	}
}
