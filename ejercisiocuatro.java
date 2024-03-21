
public class ejercisiocuatro {
    public static double calcular(double radio, String tipoCalculo) {
        double pi = 3.1416;
        double resultado = 0;

        switch (tipoCalculo) {
            case "perimetroCircunferencia":
                resultado = 2 * pi * radio;
                break;
            case "areaCirculo":
                resultado = pi * Math.pow(radio, 2);
                break;
            case "volumenEsfera":
                resultado = 4 * pi * Math.pow(radio, 3) / 3;
                break;
            default:
                System.out.println("el calculo no es valido");
        }

        return resultado;
    }

    public static void main(String[] args) {
        double radio1 = 5;
        String tipoCalculo1 = "perimetroCircunferencia";
        double resultado1 = calcular(radio1, tipoCalculo1);
        System.out.println("Figura 1:");
        System.out.println("  - Radio: " + radio1);
        System.out.println("  - Cálculo: " + tipoCalculo1);
        System.out.println("  - Resultado: " + resultado1);

        double radio2 = 3;
        String tipoCalculo2 = "volumenEsfera";
        double resultado2 = calcular(radio2, tipoCalculo2);
        System.out.println("\nFigura 2:");
        System.out.println("  - Radio: " + radio2);
        System.out.println("  - Cálculo: " + tipoCalculo2);
        System.out.println("  - Resultado: " + resultado2);
    }
}
