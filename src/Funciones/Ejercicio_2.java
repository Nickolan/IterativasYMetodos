package Funciones;

public class Ejercicio_2 {
    public static void main(String[] args) {
        String[] productos = {"Televisor", "Celular", "Laptop", "Tablet", "Cámara"};

        int[] stocks = {3, 10, 2, 6, 4};

        generarReporteBajoStock(productos,stocks);
    }
    public static void generarReporteBajoStock(String[] productos, int[] stocks){
        for (int i=0; i < productos.length;i++) {
            if (stocks[i] < 5){
                System.out.println(productos[i] + " tiene " + stocks[i] + " elementos restantes y requiere una recarga de stock");
            }
        }
    }
}
