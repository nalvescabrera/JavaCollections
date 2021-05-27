package br.com.alura;

import java.util.LinkedList;
import java.util.*;
public class TestandoIterator {
	
	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		// For no Java 5
		for(String letra: letras) {
			System.out.println(letra);
		}
	}

}
