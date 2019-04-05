package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Aluno;
import com.example.demo.domain.Disciplina;



@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
	
	
	List<Aluno> findDistinctByNomeContainingAndDisciplinasIn(
			String nome,
			List<Disciplina> disciplinas
	);

}
