package br.com.alura;


public class Funcionario {

    private String nome;
    private Integer idade;

    public Funcionario(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    } 

    public void setNome(String nome) {

        this.nome = nome;

    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}