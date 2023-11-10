package br.com.vectordev.clinicarapi.repositories.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vectordev.clinicarapi.modelo.cliente.Convenio;

public interface IConvenioRepository extends JpaRepository<Convenio, Long> {

}
