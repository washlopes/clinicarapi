package br.com.vectordev.clinicarapi.controller.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vectordev.clinicarapi.dto.cliente.ClienteDto;
import br.com.vectordev.clinicarapi.modelo.cliente.Cliente;
import br.com.vectordev.clinicarapi.services.cliente.IClienteService;

@RestController
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	
	@GetMapping("/clientes")
	public ResponseEntity<List <Cliente>> obtemTodos() {
		return ResponseEntity.status(HttpStatus.OK)
				.body(clienteService.retornarTodas());
	}
	
	@GetMapping("/clientes/codigo/{codigo}")
	public ResponseEntity <Cliente> obterPeloCodigo(@PathVariable Long codigo) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(clienteService.findByCodigo(codigo));
	}
	
	@GetMapping("/clientes/nome/{nome}")
	public ResponseEntity <List <Cliente>> obterPeloCodigo(@PathVariable String nome) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(clienteService.findByNome(nome));
	}
	
	@GetMapping("/clientes/cpf/{cpf}")
	public ResponseEntity <Cliente> obterPeloCpf(@PathVariable Long cpf) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(clienteService.findByCpf(cpf));
	}
	
	@PostMapping("/clientes")
	public ResponseEntity <Cliente> cadastrar(@RequestBody ClienteDto dto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.salvar(dto));
	}
}
