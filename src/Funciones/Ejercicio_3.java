package Funciones;

public class Ejercicio_3 {
    public static void main(String[] args) {
        String[] clientes = {"Juan Pérez", "María García", "Carlos Ramírez", "Ana López", "Sofía Torres"};
        double[] facturasPendientes = {500.75, 1200.50, 300.00, 450.30, 750.20};
        enviarFacturas(clientes,facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, double[] facturas){
        for (int i=0; i < clientes.length; i++){
            if (facturas[i] >= 500.00){
                System.out.println(clientes[i] + " debe facturar $" +facturas[i]);
            }
        }
    }
}
