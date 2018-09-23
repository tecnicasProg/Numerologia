package com.bcopstein.Numerologia;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnitParamsRunner.class)
class TesteCalculador {
	Formatador f = mock(Formatador.class);
	Redutor r = mock(Redutor.class);
	Calculador c = new Calculador(r,f);
	
	@ParameterizedTest
	@MethodSource({"J12031994,2","21081998, 2"})
	void testeCalculaNumeroDaVida(String data, int resp) {			
		when(f.formataFrase("12031994")).thenReturn("12031994");
		when(r.reducaoData("12031994")).thenReturn(2);
		
		when(f.formataFrase("21081998")).thenReturn("21081998");
		when(r.reducaoData("21081998")).thenReturn(2);
		
		int numero = c.calculaNumeroDaVida(data);
		assertEquals(numero,resp);	
	}
	
	@ParameterizedTest
	@MethodSource({"JOHN SMIT ,5","Maria Eduarda, 1"})
    void testeCalculaNumeroDestino(String nomeCompleto, int resp){		
		when(f.formataFrase("JOHN SMIT")).thenReturn("JOHN SMIT");
		when(r.reducaoFrase("JOHN SMIT")).thenReturn(5);
		
		when(f.formataFrase("Maria Eduarda")).thenReturn("MARIA EDUARDA");
		when(r.reducaoFrase("MARIA EDUARDA")).thenReturn(9);
		
		int numero = c.calculaNumeroDestino(nomeCompleto);
		assertEquals(numero,resp);	
    }
	
	@ParameterizedTest
	@MethodSource({"JOHN SMIT ,5","mAria EDuardA, 1"})
    void testeCalculaNumeroDesejosDaAlma(String nomeCompleto, int resp){
		when(f.formataFrase("JOHN SMIT")).thenReturn("JOHN SMIT");
		when(r.reducaoFrase("JOHN SMIT")).thenReturn(5);
		
		when(f.formataFrase("mAria EDuardA")).thenReturn("MARIA EDUARDA");
		when(r.reducaoFrase("MARIA EDUARDA")).thenReturn(9);
		int numero = c.calculaNumeroDesejosDaAlma(nomeCompleto);
		assertEquals(numero,resp);	
    }
	
	

}
