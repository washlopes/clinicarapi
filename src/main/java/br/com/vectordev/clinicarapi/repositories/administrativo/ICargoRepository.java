package br.com.vectordev.clinicarapi.repositories.administrativo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vectordev.clinicarapi.modelo.administrativo.Cargo;

public interface ICargoRepository extends JpaRepository<Cargo, Long> {

}
