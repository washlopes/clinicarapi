package br.com.vectordev.clinicarapi.repositories.atendimento;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vectordev.clinicarapi.modelo.atendimento.Atendimento;

public interface IAtendimentoRepository extends JpaRepository<Atendimento, Long> {

}
