package br.com.pizzaria.entidades;

import java.util.List;

public class Tabuleiro
{
	private List<Casa> casas;
	private List<Jogador> jogadores;
	private Dado dado;
	
	public List<Casa> getCasas()
	{
		return casas;
	}
	public void setCasas(List<Casa> casas)
	{
		this.casas = casas;
	}
	public List<Jogador> getJogadores()
	{
		return jogadores;
	}
	public void setJogadores(List<Jogador> jogadores)
	{
		this.jogadores = jogadores;
	}
	public Dado getDado()
	{
		return dado;
	}
	public void setDado(Dado dado)
	{
		this.dado = dado;
	}

}
