import java.util.Scanner;

public class pizzaria {
    
public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    int opcao;

    System.out.println(" MENU PIZZAS");
    System.out.println(" 1 - FRANGO");
    System.out.println("2 -  A MODA\n");
    System.out.println("3 - PORTUGUESA\n");
    opcao = scanner.nextInt();


    calcularValorPizza(opcao);
    scanner.close();

}

public static void calcularValorPizza(int opcao){
    switch(opcao){
        case 1:System.out.print("\nValor da pizza de frango é R$ 50,00");
        break;
        case 2:System.out.print("\nValor da pizza à moda é R$ 60,00");
        break;
        case 3:System.out.print("\nValor da pizza portuguesa é R$ 75,00");
        break;

        default: System.out.print("\nOpção incorreta");
    }
}






}
