import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        /*4) Criar um programa que lê a idade de uma pessoa e diz se ela é maior de idade ou não.*/

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int idade = entrada.nextInt();

        if(idade < 18){
            System.out.println("Você é menor de idade!");
        }else{
            System.out.println("Você é maior de idade!");
        }

    }
}
