package br.com.alura;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		Aluno a4 = new Aluno("Natalia Cabrera", 1234);
		Aluno a5 = new Aluno("Ana Carolina", 5678);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		javaColecoes.matricula(a5);
		
		// Iterator demonstrando
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		//Set<Aluno> alunos = javaColecoes.getAlunos();
		
		//Retorna uma cole��o sincronizada (thread-safe)
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		System.out.println("o aluno " + a1+ " est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini",34672);
		System.out.println("E esse Turini est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("o a1 � equals ao Turini?");
		System.out.println(a1.equals(turini));
	}
}
