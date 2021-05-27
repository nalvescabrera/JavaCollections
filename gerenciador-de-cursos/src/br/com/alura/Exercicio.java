package br.com.alura;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Exercicio {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
    
        //Mapping inicial
        System.out.println("Map inicial: " + pessoas);
        
        //Usando keySet para pegar as chaves
		System.out.println("A chave é  " + pessoas.keySet());

	}

}
