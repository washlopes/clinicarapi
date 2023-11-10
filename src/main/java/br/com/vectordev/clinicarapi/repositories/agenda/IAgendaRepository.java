package br.com.vectordev.clinicarapi.repositories.agenda;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.vectordev.clinicarapi.modelo.administrativo.Colaborador;
import br.com.vectordev.clinicarapi.modelo.agenda.Agenda;

public interface IAgendaRepository extends JpaRepository<Agenda, Long> {

	@Query("select a from Agenda a where a.colaborador = :colaborador")
	public List <Agenda> findPeloColaborador(Colaborador colaborador);
	
}
