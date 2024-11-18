public class CalculadoraGeometria {

    
    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetroQuadrado(double lado) {
        return 4 * lado;
    }

    public static double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }

    public static double calcularPerimetroRetangulo(double largura, double altura) {
        return 2 * (largura + altura);
    }

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

   
    public static double calcularPerimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {
        double ladoQuadrado = 5.0;
        double larguraRetangulo = 4.0;
        double alturaRetangulo = 6.0;
        double raioCirculo = 3.0;

        System.out.println("Área do quadrado: " + calcularAreaQuadrado(ladoQuadrado));
        System.out.println("Perímetro do quadrado: " + calcularPerimetroQuadrado(ladoQuadrado));
        System.out.println("Área do retângulo: " + calcularAreaRetangulo(larguraRetangulo, alturaRetangulo));
        System.out.println("Perímetro do retângulo: " + calcularPerimetroRetangulo(larguraRetangulo, alturaRetangulo));
        System.out.println("Área do círculo: " + calcularAreaCirculo(raioCirculo));
        System.out.println("Perímetro do círculo: " + calcularPerimetroCirculo(raioCirculo));
    }
}

    

