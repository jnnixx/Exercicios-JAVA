import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args){
     /**
      * 1) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: (switch-case)
      *
      * 1 – Adição
      * 2 – Subtração
      * 3 – Multiplicação
      * 4 – Divisão
      * */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá usuário!\nInforme a opção desejada para realizar o cálculo: \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");
        int opcao = entrada.nextInt();

        System.out.println("Agora informe o primeiro numero:");
        int a = entrada.nextInt();
        System.out.println("Informe o segundo numero");
        int b = entrada.nextInt();

        switch(opcao){
            case 1:
                int soma = a + b;
                System.out.println("Você escolheu realizar um calculo de adição o resultade" + a + " + " + b  + " = " + soma);
                break;
            case 2:
                int subtracao = a - b;
                System.out.println("Você escolheu realizar um calculo de subtração, o resultado de " + a + " - " + b + " = " + subtracao);
                break;
            case 3:
                int multiplicacao = a * b;
                System.out.println("Você escolheu realizar um calculo de multiplicação, o resuçtado " + a + " x " + b + " = " + multiplicacao);
                break;
            case 4:
                int divisao = a / b;
                System.out.println("Você escolheu realizar um calculo de divisão, o resultado " + a + " / " + b + " = " + divisao);
                break;
            default:
                System.out.println("Valor invalido!");





        }

    }
}
