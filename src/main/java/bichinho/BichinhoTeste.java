package bichinho;

public class BichinhoTeste {

    public static void main(String[] args) {
        Bichinho pochita = new Bichinho("Pochita",4, 5.14);


        System.out.println(pochita.getDorme());
        System.out.println(pochita.dormir(3));

    }
}
