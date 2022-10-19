public class Empregado {
    /*2) Crie uma classe Empregado que possui:
	* Atributos: nome, sobrenome, salario
	* Construtores:
	- Cria empregados com base nos parâmetros nome, sobrenome e salario;
	* Métodos:
	- calcularSalarioAnual() => deve retornar double
	- aumentarSalario(double aumento) => aumenta o valor do salário
	- nomeCompleto() => deve retornar a concatenação do nome e sobrenome*/


    String nome;
    String sobrenome;
    double salario;

    Empregado(String nome, String sobrenome, double salario){
        this.nome =nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    double CalcularSalario(){
        double salarioAnual = this.salario * 12;
        return salarioAnual;
    }

    double AumentarSalario(double aumento){
        this.salario+= aumento;
        return  aumento;
    }

    String NomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Francisco", "Pedro",2.850);

        System.out.println(empregado1.NomeCompleto());

    }
}
