package Funciones;

public class Ejercicio_6 {
    public static void main(String[] args) {
        double[] facturas = {150.75, 230.00, 120.50, 300.25, 180.75, 250.00, 175.50, 220.75, 190.00, 275.50};
        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas){
        double nuevoPrecio;

        for (int i=0; i < facturas.length; i++){
            nuevoPrecio = facturas[i] + (facturas[i] * 0.21);
            facturas[i] = nuevoPrecio;
            System.out.println(nuevoPrecio);
        }
    }
}
