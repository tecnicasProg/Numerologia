package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
@RunWith(JUnitParamsRunner.class)
class TesteCalculador {

	@Test
	@Parameters({"Gabriel,36","1234, 10"})
	void testeCalculaNumeroDaVida(String data, int resp) {
		Formatador f = new Formatador();
		Redutor r = new Redutor();
		Calculador c = new Calculador(r,f);
		int numero = c.calculaNumeroDaVida(data);
		assertEquals(numero,resp);	
	}

}
