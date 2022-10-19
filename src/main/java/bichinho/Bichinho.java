package bichinho;

import java.util.ArrayList;

/*Crie uma classe Bichinho:
	* Atributos: nome, idade, peso, bucho (lista de Comida), estaDormindo(boolean)
	* Construtores: Cria bichinhos com base nos atributos nome, idade, peso. Bucho deve começar com lista vazia. estaDormindo deve iniciar false.
	* Métodos:
		- comer(Comida comida) => a comida deve alterar o peso do bichinho, o bichinho não come a mesma comida duas vezes. Ele não come se estiver dormindo!
	  - dormir(int horas) => altera o boolean estaDormindo p/ true, para cada hora dormida o bichinho perde 10% de seu peso atual;
		- acordar() => altera o boolean estaDormindo p/ false

Crie uma classe Comida:
	* Atributos: nome, peso;
	* Construtores: Cria a comida com base nos parâmetros nome e peso;
	* Métodos:
		- getNome()
		- getPeso()*/
public class Bichinho {
    private String nome;
    private int idade;
    private double peso;
    private boolean estaDormindo;
    int horas;

    ArrayList<Comida> bucho = new ArrayList<>();

    Bichinho(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.estaDormindo = false;
        this.horas = horas;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double getPeso(){
        return this.peso;
    }
    public boolean getDorme(){
        return  this.estaDormindo;
    }
    public int horinhas(){
        return this.horas;
    }


    //comer
   public void comer(Comida comida){
        bucho.add(comida);
        if (!bucho.contains(comida) && estaDormindo == false){
            this.peso += comida.peso;
        }
    }
    //dormir

    public double dormir(int horas) {
        double bichinhoEmagrece = horas * this.peso * 0.1;
        return bichinhoEmagrece;
    }
    //acordar
     public boolean acorda (Bichinho acorda){
        if(!this.estaDormindo){
            System.out.println("Bichinho está acordado");

        }
        return estaDormindo;
     }





}
