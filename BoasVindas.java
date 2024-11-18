import java.util.Scanner;
public class BoasVindas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.nextLine();
    
     // Chama o método exibirBoasVindas passando nome e sobrenome como parâmetros
     exibirBoasVindas(nome, sobrenome);
    
     scanner.close();
    }

  // Método que exibe a mensagem de boas-vindas
  public static void exibirBoasVindas(String nome, String sobrenome) {
    System.out.println("Bem-vindo, " + nome + " " + sobrenome + "!");
}
}



