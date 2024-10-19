package Funciones;

public class Ejercicio_4 {
    public static void main(String[] args) {
        String[] clientes = {"Juan Pérez", "María García", "Carlos Ramírez",
                "Ana López", "Sofía Torres"};

        int[] compras = {5, 15, 3, 10, 6};
        calcularDescuentos(clientes, compras);
    }
    public static void calcularDescuentos(String[] clientes, int[] compras){

        for (int i=0; i < clientes.length; i++){
            if (compras[i] >= 10){
                System.out.println("El comprador: " + clientes[i] + " recibe un 10% de descuento en sus compras");
            }
        }

    }


}
