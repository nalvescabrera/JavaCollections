package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Curso {

	private String nome;
	private String instrutor;
	// LinkedList mais rápida em questão de adicionar um novo elemento
	// Mas é lenta para acessar determinado elemento
	private List<Aula> aulas = new LinkedList<Aula>();
	
	//Só funciona com classes compareble
	//private Set<Aluno> alunos = new TreeSet<>();
	private Set<Aluno> alunos = new LinkedHashSet<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	// Não será possivel alterar o valor desta lista fora da classe
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		// int tempoTotal = 0;
		// for (Aula aula : aulas) {
		// tempoTotal +=aula.getTempo();
		// }
		// return tempoTotal;

		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + " , tempo total: " + this.getTempoTotal() + ", " + "aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		for (Aluno aluno : alunos) {
			if(aluno.getNumeroMatricula()== numero)
				return aluno;
		}
		throw new NoSuchElementException("matricula não encontrada " + numero);
	}

}
