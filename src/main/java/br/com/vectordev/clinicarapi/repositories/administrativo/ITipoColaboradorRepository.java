package br.com.vectordev.clinicarapi.repositories.administrativo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vectordev.clinicarapi.modelo.administrativo.TipoColaborador;

public interface ITipoColaboradorRepository extends JpaRepository<TipoColaborador, Long> {

}
