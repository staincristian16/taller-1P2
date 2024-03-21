
public class ejercisiouno {
    
    public static double calcularPrecioConDescuento(double precio, double descuento) {
        double precioDescontado = precio - (precio * descuento / 100);
        return precioDescontado;
    }
    public static void main(String[] args) {
       
        double precio1 = 500;
        double descuento1 = 20;
        double precioFinal1 = calcularPrecioConDescuento(precio1, descuento1);
        System.out.println("primer precio: " + precio1 + "€ - Descuento: " + descuento1 + "% - Precio final: " + precioFinal1 + "€");

        double precio2 = 60;
        double descuento2 = 10;
        double precioFinal2 = calcularPrecioConDescuento(precio2, descuento2);
        System.out.println(" segundo precio: " + precio2 + "€ - Descuento: " + descuento2 + "% - Precio final: " + precioFinal2 + "€");
    }
}
    
