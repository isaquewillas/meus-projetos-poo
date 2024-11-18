import java.util.Scanner;

public class ConversorMoeda {
    public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);
          
    
          System.out.print("Digite o valor em reais (R$) que você deseja converter para Dólar (US$) e para Euro (€): ");
            double valorEmReais = scanner.nextDouble();
    
            converterParaDolar(valorEmReais);
            converterParaEuro(valorEmReais);

    
            scanner.close();
    
        }

        public static void converterParaDolar(double valorEmReais) {
            double valorEmDolar = valorEmReais * 0.19;
            System.out.printf("R$ %.2f em Dólares é igual a US$ %.2f.\n", valorEmReais, valorEmDolar);
        }

        public static void converterParaEuro(double valorEmReais){
            double valorEmEuro = valorEmReais* 0.16;
            System.out.printf("R$ %.2f em Reais é igual a R$ %.2f.\n", valorEmReais, valorEmEuro);
            
            
        
        } 
    
    }
    