package com.bcopstein.Numerologia;

// Todos os metodos geram IllegalArgumentException em caso de caracter ilegal
public class Calculador{
    private Formatador formatador;
    private Redutor reducao;

    // Recebe o redutor e o formatador a serem usados em todos os calculos
    // por injecao de dependencia
    public Calculador(Redutor reducao, Formatador formatador){
        this.reducao = reducao;
        this.formatador = formatador;
    }

    public int calculaNumeroDaVida(String data){
        int numero = 0;
        return numero;
    }

    public int calculaNumeroDestino(String nomeCompleto){
        int numero = 0;
        return numero;
    }

    public int calculaNumeroDesejosDaAlma(String nomeCompleto){
    	int numero = 0;
        return numero;
    }
}