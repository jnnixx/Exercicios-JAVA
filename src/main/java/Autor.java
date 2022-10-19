public class Autor {
    /*Crie uma classe Autor que possui:
	* Atributos: nome, email;
	* Construtores:
	- Cria autores com base nos parâmetros nome e email;
	* Métodos:
	- alteraNome(String novoNome) => muda o nome atual do autor
	- alteraEmail(String novoEmail) => muda o email atual do autor*/

    private String nome;
    private String email;

    Autor(String nome, String email){
        this.nome = nome;
        this.email = email;

    }

    public String getNome() {
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }

    public String setEmail(String novoEmail){
        String setEmail = novoEmail;
        System.out.println("Seu nome foi alterado para: " +  novoEmail);
        return novoEmail;
    }
    public String setNome(String novoNome){
        String setNome = novoNome;
        System.out.println("Seu nome foi alterado para: " + novoNome);
        return novoNome;
    }

    public static void main(String[] args) {
        Autor autor1 = new Autor("Jenni", "usuario@gmail.com");
        autor1.getNome();
        autor1.setNome("Fred");
        autor1.getEmail();
        autor1.setEmail("usu@gmail.com");

    }

}
