package com.bcopstein.Numerologia;

import java.util.regex.Pattern;

public class Formatador{
    // Formata uma palavra da lingua inglesa
    // A palavra recebida so pode conter letras ou digitos
    // Se a palavra contiver qualquer outro tipo de simbolo deve retornar IllegalArgumentException
    // Se a palavra estiver vazia tambem retorna a excecao
    // Retorna a palavra em maiusculas 
    public String formataPalavra(String palavra){
        if(palavra.equals(""))
        	throw new IllegalArgumentException();
       for(int i = 0;i<palavra.length();i++) {
    	   if(!Character.isLetterOrDigit(palavra.charAt(i))) {
    		   throw new IllegalArgumentException();
    	   }
       }
       palavra = palavra.toUpperCase();
    	return palavra;
    }

    // Utiliza o metodo formataPalavra e confere se a primeira letra nao e numerica
    public String formataPalavraPlus(String palavra) {
        if(Character.isDigit(palavra.charAt(0)))
        		throw new IllegalArgumentException();
    	return formataPalavra(palavra);
    }

    // Formata frases compostas por palavras separadas por espacos em branco e/ou simbolos de pontuacao
    // Frases vazias geram IllegalArgumentException
    // As palavras da frase devem ser convertidas pelo metodo formataPalavra
    // Qualquer outro simbolo gera IllegalArgumentException
    // Retorna um array de palavras validas 
    public String formataFrase(String frase){
        String [] fraseSemEspaco =  frase.split(" ");
        String ret = "";
        for(int i = 0; i<fraseSemEspaco.length;i++) {
        	ret = formataPalavra(fraseSemEspaco[i])+" ";
        }
        return ret;
    }
}
