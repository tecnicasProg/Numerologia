package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
class Testefomatador {

	
	@ParameterizedTest
	@CsvSource({"Gabriel,GABRIEL","1234,1234","oi22E,OI22E" })
	void testeFormatarPalavra(String palavra, String resp) {
		Formatador f = new Formatador();
		String palavraformatada = f.formataPalavra(palavra);
		assertEquals(palavraformatada,resp);	
	}
	
	@ParameterizedTest
	@CsvSource({"Teste2,TESTE2","TEEesT,TEEEST"})
	void testeFormatarPalavraPlus(String palavra, String resp) {
		Formatador f = new Formatador();
		String palavraformatada = f.formataPalavraPlus(palavra);
		assertEquals(palavraformatada,resp);	
	}
	
	@ParameterizedTest
	@CsvSource({"Testando Frases, TESTANDO FRASES","Teste frase c 1232, TESTE FRASE C 1232"})
	void testeFormatarFrase(String palavra, String resp) {
		Formatador f = new Formatador();
		String palavraformatada = f.formataFrase(palavra);
		assertEquals(palavraformatada,resp);	
	}
	
	
	
	

}