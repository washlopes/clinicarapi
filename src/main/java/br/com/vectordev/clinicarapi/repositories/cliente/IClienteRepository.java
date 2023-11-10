package br.com.vectordev.clinicarapi.repositories.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vectordev.clinicarapi.modelo.cliente.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {

	
}
