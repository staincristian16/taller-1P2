
public class ejercisioseix {
   public static String convertirASegundos(int segundos, String tipo) {
        int resultado = 0;
        String unidad = "";

        switch (tipo) {
            case "dias":
                resultado = segundos / (24 * 60 * 60);
                unidad = "días";
                break;
            case "horas":
                resultado = segundos / (60 * 60);
                unidad = "horas";
                break;
            case "minutos":
                resultado = segundos / 60;
                unidad = "minutos";
                break;
            default:
                System.out.println("la conversion no es valida");
                return "";
        }

        return resultado + " " + unidad;
    }

    public static void main(String[] args) {
        // Casos de prueba
        int segundos1 = 86400;
        String tipo1 = "dias";
        String resultado1 = convertirASegundos(segundos1, tipo1);
        System.out.println("Tiempo 1:");
        System.out.println("  - Segundos: " + segundos1);
        System.out.println("  - Tipo: " + tipo1);
        System.out.println("  - Resultado: " + resultado1);

        int segundos2 = 3600;
        String tipo2 = "horas";
        String resultado2 = convertirASegundos(segundos2, tipo2);
        System.out.println("\nTiempo 2:");
        System.out.println("  - Segundos: " + segundos2);
        System.out.println("  - Tipo: " + tipo2);
        System.out.println("  - Resultado: " + resultado2);
    }
}
