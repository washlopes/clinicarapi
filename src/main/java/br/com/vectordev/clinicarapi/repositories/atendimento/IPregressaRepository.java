package br.com.vectordev.clinicarapi.repositories.atendimento;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vectordev.clinicarapi.modelo.atendimento.Pregressa;

public interface IPregressaRepository extends JpaRepository<Pregressa, Long> {

}
