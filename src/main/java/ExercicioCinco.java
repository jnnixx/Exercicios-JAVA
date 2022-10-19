import Correcao.ExercicioTresCorrecao;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        /*5) Criar programa java que lê N e depois N
        valores armazenado no array,
        em seguida retorna a soma total e a média dos valores.*/
        double somaTotal = 0;
        double media = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de numeros");
        int n = entrada.nextInt();
        int[] vetor = new int[n];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Informe o valor da " + (i+1) + "º posição do vetor");
            vetor[i] = entrada.nextInt();
        }
        for(int i = 0; i < vetor.length; i++){
            somaTotal += vetor[i];
        }

        media = somaTotal / vetor.length;
        System.out.println("A soma total dos valores é " + somaTotal);
        System.out.println("E a media é " + media);

    }
}
