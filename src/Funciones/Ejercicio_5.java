package Funciones;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int[] calificaciones = {8, 9, 7, 10, 10, 6, 8, 9, 7, 10};
        System.out.println("El promedio de satisfaccion es de: " + calcularPromedioSatisfaccion(calificaciones));
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones){
        double total=0;
        for (int i=0; i<calificaciones.length; i++){
            total = total + calificaciones[i];
        }
        return total / calificaciones.length;
    }
}
