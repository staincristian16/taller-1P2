
public class ejercisiotres {
   public static double convertidor(double dolares) {
        double factorConversion = 1.33250;
        double euros = dolares * factorConversion;
        return euros;
    }
    public static void main(String[] args) {
        // Casos de prueba
        double dolares1 = 200;
        double euros1 = convertidor(dolares1);
        System.out.println(dolares1 + " USD = " + euros1 + " EUR");

        double dolares2 = 600;
        double euros2 = convertidor(dolares2);
        System.out.println("\n" + dolares2 + " USD = " + euros2 + " EUR");
    }
}
