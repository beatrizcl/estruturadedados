package br.com.pizzaria.entidades;

import java.util.List;

public class Pizza
{
	private List<Ingrediente> ingredientes;
	private Jogador jogador;

	public List<Ingrediente> getIngredientes()
	{
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes)
	{
		this.ingredientes = ingredientes;
	}

	public Jogador getJogador()
	{
		return jogador;
	}

	public void setJogador(Jogador jogador)
	{
		this.jogador = jogador;
	}

}
