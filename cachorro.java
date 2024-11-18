import java.util.Scanner;
public class cachorro {
     String nome;
     int idade;

    public cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    
    public void comer() {
        System.out.println(nome + "está comento: Ração!");

    }
    
    public void BuscarObjeto() {
        System.out.println(nome + "ele vai buscar uma bolinha para brincar");

    }
    
    
    public void brincar() {
        System.out.println(nome + "ele quer brincar pega pega");


    }
    
    public void dormir() {
        System.out.println(nome + " ele vai dormir");

    
    }
    
    public void envelhecer() {
        idade++;
        System.out.println(nome + " agora tem " + idade + " anos.");
    }

    public static void main(String[] args) {
        cachorro meuCachorro = new cachorro("Rex", 3);
        meuCachorro.latir();
        meuCachorro.envelhecer();
    }
}




    
