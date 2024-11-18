import java.util.Scanner;

public class carro {
public static void main (String[] args) { 

    Scanner scanner = new Scanner(System.in);

    String marca,modelo,cor;
    int velocidadeAtual=0;
    int opcao=1;
    
   System.out.println("Digite a marca do veiculo:");
   marca = scanner.next();


   System.out.println("Digite o modelo do veiculo:");
   modelo = scanner.next();

   System.out.println("Digite a cor do veiculo:");
   cor = scanner.next();


   while (opcao !=3){
   System.out.println("Automóvel: 001");
   System.out.println("Marca: " + marca);
   System.out.println("Modelo: " + modelo);
   System.out.println("Automóvel: " + cor);
   System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");

 System.out.println("O que deseja fazer ?");
 System.out.println("1 - Acelerar");
 System.out.println("2 - frear");
 System.out.println("3 - sair");
 System.out.println("Digite uma opcao:");
 opcao = scanner.nextInt();

 switch (opcao){ 
   case 1:  velocidadeAtual = acelerar(velocidadeAtual);
   break;
   
   case 2: velocidadeAtual = frear(velocidadeAtual);
   break;
   
   case 3: sair();
  break;

  default:System.out.println("Opcao digitada está incorreta");

} 

}

scanner.close();
}


    
   
    
      public static int acelerar (int velocidadeAtual) {
       velocidadeAtual=velocidadeAtual + 10;
       return velocidadeAtual;
    }

     public static int frear (int velocidadeAtual){
    if (velocidadeAtual==0){
     velocidadeAtual=0;
     return velocidadeAtual;
    
    }else {

    velocidadeAtual=velocidadeAtual - 5;
    return velocidadeAtual;

    }
   }
   





public static void sair (){

System.out.println("programação sendo encerrado");


}

}


