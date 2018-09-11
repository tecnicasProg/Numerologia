package com.bcopstein.Numerologia;

public interface IRedutor {
	public int reducaoData(String data);
	public int reducaoFrase(String frase);
	public void setTipoTabela(TipoTabela tipo);
    public int reducaoPalavra(String palavra);
   
}
