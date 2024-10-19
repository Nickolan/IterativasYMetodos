package Funciones;

public class Ejercicio_7 {
    public static void main(String[] args) {
        double[] compras = {500.75, 120.00, 750.50, 200.25, 900.75, 150.00, 85.50, 170.75, 1000.00, 225.50};
        aplicarDescuento(compras);
        System.out.println("Montos de las compras de los clientes después del descuento:");
        for (double monto : compras) {
            System.out.println(monto);
        }
    }

    public static void aplicarDescuento(double[] compras){
        double descuento = 0.10;
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                compras[i] -= compras[i] * descuento;
            }
        }
    }
}
