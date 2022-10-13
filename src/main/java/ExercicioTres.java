import java.util.Scanner;

public class ExercicioTres {
    /*3) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes
      que V1 e V2 possuem valores idênticos nas mesmas posições. */
    public static void main(String[] args) {
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int vezesIgual = 0;
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i+1) + "º valor do vetor um");
            v1[i] = entrada.nextInt();
            System.out.println("Digite o " + (i+1) + "º valor do vetor dois");
            v2[i] = entrada.nextInt();
        }
        for(int i = 0; i < 5; i++ ){
            if(v1[i] == v2[i]){
                vezesIgual++;
            }
        }
        System.out.println("v1 e v2 possuem " + vezesIgual + " valor identicos.");
    }
}
