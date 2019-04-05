package com.example.demo.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Aluno;
import com.example.demo.domain.Disciplina;
import com.example.demo.repositories.AlunoRepository;
import com.example.demo.repositories.DisciplinaRepository;

@Service
public class DbService {

	@Autowired
	private DisciplinaRepository disRep;

	@Autowired
	private AlunoRepository aluRep;

	public void inicializaBancoDeDados() throws ParseException {

		Disciplina dis1 = new Disciplina(null, "Matematica","Primeiro Semestre");
		Disciplina dis2 = new Disciplina(null, "Geografia","Segundo Semestre");

		Aluno a1 = new Aluno(null, "Joao", "joao@gmail.com");
		Aluno a2 = new Aluno(null, "Maria", "maria@gmail.com");

		a1.getDisciplinas().addAll(Arrays.asList(dis1,dis2));
		a2.getDisciplinas().addAll(Arrays.asList(dis2));

		dis1.getAlunos().addAll(Arrays.asList(a1));
		dis2.getAlunos().addAll(Arrays.asList(a1,a2));

		disRep.saveAll(Arrays.asList(dis1, dis2));
		aluRep.saveAll(Arrays.asList(a1, a2));
	}

}
