package bichinho;
/*Crie uma classe Comida:
	* Atributos: nome, peso;
	* Construtores: Cria a comida com base nos parâmetros nome e peso;
	* Métodos:
	* - getNome()
	* - getPeso()*/
public class Comida {
	private String nome;
	public double peso;

	Comida(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome(){
		return this.nome;
	}




}
