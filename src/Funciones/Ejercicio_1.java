package Funciones;

public class Ejercicio_1 {
    public static void main(String[] args) {
        double[] ventas = {120.5, 300.75, 450.9, 180.2, 200.0,
                320.4, 400.6, 150.8, 190.1, 370.3,
                260.0, 310.7, 480.8, 300.0, 210.5,
                290.6, 330.3, 250.4, 170.9, 190.0,
                200.5, 400.0, 360.8, 120.4, 500.6,
                390.2, 290.3, 450.0, 320.1, 280.9};

        calcularIngresosMensuales(ventas);
    }

    public static void calcularIngresosMensuales(double[] lista){
        double total = 0;
        for (int j=0; j<lista.length; j++){
            total += lista[j];
        }
        System.out.println("El total de ventas mensuales es de: $" + total);
    }
}
