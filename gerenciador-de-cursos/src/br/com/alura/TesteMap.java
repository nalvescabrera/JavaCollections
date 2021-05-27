package br.com.alura;

import java.util.Map.Entry;
import java.util.*;
import java.util.Map.Entry;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
       
        for (Map.Entry<String, Integer> entry : nomesParaIdade.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }
        
        //Acessando as chaves com keySet
        System.out.println("Aqui apenas as chaves " +nomesParaIdade.keySet());
        
        //Para acessar os valores
        System.out.println("Aqui apenas so valores " +nomesParaIdade.values());
    }
}