import java.util.Scanner;

public class cidade {
    
    public static void main(String[] args) {

   int opcaoCidade;
   int resultadoTemp;
   String nomeCidade;

    
        Scanner scanner = new Scanner(System.in);
        Temperatura Temperatura = new Temperatura();

     System.out.print("****VERIFIQUE A TEMPERATURA *****\n\n"+
     ">>>>>>> Escolha o código de uma cidade para verificar a temperatura média <<<<<<<\n"+
     "1 - Bangkok\n2 - Dubai\n3 - São Paulo\n4 - Nova York\n5 - Sydney\n6 - Londres\n"+
     "7 - Moscou\n8 - Cidade do México\n9 - Tóquio\n10 - Cairo\n");
     
        System.out.print("Digite sua opcao:");
        opcaoCidade = scanner.nextInt();
        scanner.close();


     // Lendo a opção do usuário
     System.out.print("Digite o número da cidade (1-10): ");
     int opcaoCidade = scanner.nextInt();

  
     switch(opcaoCidade){

        case 1:
          nomeCidade = "Bangkok";
          break;
          
       case 2:
        nomeCidade = "Dubai";
        break;
    
        case 3:
        nomeCidade = "São Paulo";
        break;
    
        case 4:
        nomeCidade = "Nova York";
        break;
        
        case 5:
        nomeCidade = "Sydney";
        break;

        case 6:
       nomeCidade = "Londres";
        break;

        case 7:
        nomeCidade = "Moucou";
        break;
        
        
        
        default:System.out.println("Opcao digita está incorreta");
    }
    
        }
    }
    


