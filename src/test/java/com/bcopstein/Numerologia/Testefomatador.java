package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


@RunWith(JUnitParamsRunner.class)
class Testefomatador {

	
	@Test
	@Parameters({"Gabriel,GABRIEL","1234,1234","oi22E,OI22E"})
	void testeFormatarPalavra(String palavra, String resp) {
		Formatador f = new Formatador();
		String palavraformatada = f.formataPalavra(palavra);
		assertEquals(palavraformatada,resp);	
	}

}