import java.util.Scanner;
public class Calculadora {
    public static void main (String[] args){ 
    
    Scanner scanner = new Scanner(System.in);
    
    int opcao=0;
    System.out.println("CALCULADORA - MENU PRINCIPAL");
    System.out.println("1- SOMAR");
    System.out.println("2-SUBTRAIR");
    System.out.println("3-MULTIPLICAR");
    System.out.println("4-DIVIDIR");
    System.out.println("escolha uma opcao:");

    opcao = scanner.nextInt();
    
    
switch(opcao){

    case 1:
      somar();
      break;
      
   case 2:
    subtrair();
    break;

    case 3:
    multiplicar();
    break;

    case 4:
    dividir();
    break;
    default:System.out.println("Opcao digita está incorreta");
}

    }

public static void somar () {
float num1,num2,resultado;
Scanner scanner = new Scanner (System.in);
System.out.print("Digite o 1 numero:");
num1 = scanner.nextFloat();
System.out.print("Digite o 2 numero:");
num2 = scanner.nextFloat();


resultado = num1+num2;


exibirResultado(resultado);


scanner.close();

}

public static void subtrair() {
    float num1,num2,resultado;
    Scanner scanner = new Scanner (System.in);
    System.out.print("Digite o primeiro numero:");
    num1 = scanner.nextFloat();
    System.out.print("Digite o segundo numero:");
    num2 = scanner.nextFloat();
    resultado = num1-num2;

    exibirResultado(resultado);
    
    scanner.close();


}

public static void multiplicar() {
    float num1,num2,resultado;
    Scanner scanner = new Scanner (System.in);
    System.out.print("Digite o primeiro numero:");
    num1 = scanner.nextFloat();
    System.out.print("Digite o segundo numero:");
    num2 = scanner.nextFloat();
    resultado = num1*num2;

    exibirResultado(resultado);
    
    scanner.close();

}

public static void dividir() {
    float num1,num2,resultado;
    Scanner scanner = new Scanner (System.in);
    System.out.print("Digite o primeiro numero:");
    num1 = scanner.nextFloat();
    System.out.print("Digite o segundo numero:");
    num2 = scanner.nextFloat();
    resultado = num1 / num2;

    exibirResultado(resultado);
    
    scanner.close();

}

public static void exibirResultado (float resultadoRecebido){
System.out.println("O resultado é: " + resultadoRecebido);

}



}