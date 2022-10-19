/*4) Crie uma classe Livro que possui:
 * Atributos: nome, autor, preco;
 * Construtores:
 * - Cria livros com base nos parâmetros nome, autor(objeto da
 * classe Autor), preco;*/
public class Livro {
    String nomeLivro;
    String nomeAutor;
    Double preco;

    Livro(String nomeLivro, String nomeAutor, Double preco){
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.preco = preco;

    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Codigo Limpo","Robert Cecil Martin",81.89);
        System.out.println("Nome do livro é " + livro1.nomeLivro + " o autor é " + livro1.nomeAutor + " e seu preço é " + livro1.preco + " reais.");
    }
}
