
public class ejercisiodos {
    public static double calcular(double lado1, double lado2, String tipoCalculo) {
        double resultado = 0;
        if (tipoCalculo.equals("perimetro")) {
            resultado = lado1 + lado1 + lado2 + lado2;
        } else if (tipoCalculo.equals("area")) {
            resultado = lado1 * lado2;
        } else {
            System.out.println("Tipo de cálculo no válido");
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Casos de prueba
        double ladouno = 7;
        double ladodos = 3;
        String calculouno = "perimetro";
        double resultado_1 = calcular(ladouno, ladodos, calculouno);
        System.out.println("Rectángulo 1:");
        System.out.println("  - primer lado: " + ladouno);
        System.out.println("  - segundo lado: " + ladodos);
        System.out.println("  - Cálculo: " + calculouno);
        System.out.println("  - Resultado: " + resultado_1);

        double lado1_2 = 12;
        double lado2_2 = 9;
        String tipoCalculo_2 = "area";
        double resultado_2 = calcular(lado1_2, lado2_2, tipoCalculo_2);
        System.out.println("\nRectángulo 2:");
        System.out.println("  - Lado 1: " + lado1_2);
        System.out.println("  - Lado 2: " + lado2_2);
        System.out.println("  - Cálculo: " + tipoCalculo_2);
        System.out.println("  - Resultado: " + resultado_2);
    }
}
