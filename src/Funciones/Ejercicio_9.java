package Funciones;

public class Ejercicio_9 {
    public static void main(String[] args) {
        double[] preciosOriginales = {100.00, 200.50, 150.75, 250.00, 300.25, 175.50, 225.75, 125.00, 190.50, 275.00};
        double[] preciosConDescuentos = calcularPrecioFina(preciosOriginales, 0.10);
        for (double precio:
            preciosConDescuentos ) {
            System.out.println("Precio actual: " + precio);
        }
    }

    public static double[] calcularPrecioFina(double[] preciosOriginales, double descuento){
        double[] listdescuento = new double[preciosOriginales.length];
        double precioDescuento;
        for (int i=0; i< preciosOriginales.length;i++){
            precioDescuento = preciosOriginales[i] + preciosOriginales[i] * descuento;
            listdescuento[i] = precioDescuento;
        }
        return listdescuento;
    }
}
