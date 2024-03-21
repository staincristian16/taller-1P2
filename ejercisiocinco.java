
public class ejercisiocinco {
     public static int convertirASegundos(int dias, int horas, int minutos) {
        int segundosTotales = (dias * 24 * 60 * 60) + (horas * 60 * 60) + (minutos * 60);
        return segundosTotales;
    }

    public static void main(String[] args) {
        
        int dias1 = 4;
        int horas1 = 12;
        int minutos1 = 40;
        int segundosTotales1 = convertirASegundos(dias1, horas1, minutos1);
        System.out.println("Tiempo 1:");
        System.out.println("  - Días: " + dias1);
        System.out.println("  - Horas: " + horas1);
        System.out.println("  - Minutos: " + minutos1);
        System.out.println("  - Segundos totales: " + segundosTotales1);

        int dias2 = 1;
        int horas2 = 7;
        int minutos2 = 12;
        int segundosTotales2 = convertirASegundos(dias2, horas2, minutos2);
        System.out.println("\nTiempo 2:");
        System.out.println("  - Días: " + dias2);
        System.out.println("  - Horas: " + horas2);
        System.out.println("  - Minutos: " + minutos2);
        System.out.println("  - Segundos totales: " + segundosTotales2);
    }
}
