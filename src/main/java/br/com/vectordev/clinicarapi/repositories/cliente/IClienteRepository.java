package br.com.vectordev.clinicarapi.repositories.cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.vectordev.clinicarapi.modelo.cliente.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
	
	@Query("SELECT c FROM Cliente c WHERE UPPER(c.nome) like CONCAT('%', UPPER(:nome), '%')")
	public List <Cliente> findByName(@Param("nome") String nome);
	
	@Query("SELECT  c FROM Cliente c WHERE c.cpf = :cpf")
	public Optional <Cliente> findByCpf(@Param("cpf") Long cpf);
	
}
