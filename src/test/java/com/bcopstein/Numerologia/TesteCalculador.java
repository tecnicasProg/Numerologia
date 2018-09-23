package com.bcopstein.Numerologia;

import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnitParamsRunner.class)
class TesteCalculador {
	Formatador f = mock(Formatador.class);
	Redutor r = mock(Redutor.class);
	Calculador c = new Calculador(r,f);
	
	@Test
	@Parameters({"JOHN SMIT ,5","1234, 1"})
	void testeCalculaNumeroDaVida(String data, int resp) {		
		int numero = c.calculaNumeroDaVida(data);
		assertEquals(numero,resp);	
	}
	
	@Test
	@Parameters({"JOHN SMIT ,5","1234, 1"})
    void testeCalculaNumeroDestino(String nomeCompleto, int resp){
		int numero = c.calculaNumeroDestino(nomeCompleto);
		assertEquals(numero,resp);	
    }
	
	@Test
	@Parameters({"JOHN SMIT ,5","1234, 1"})
    void testeCalculaNumeroDesejosDaAlma(String nomeCompleto, int resp){
		int numero = c.calculaNumeroDesejosDaAlma(nomeCompleto);
		assertEquals(numero,resp);	
    }
	
	

}
