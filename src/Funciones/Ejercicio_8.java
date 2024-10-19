package Funciones;

public class Ejercicio_8 {
    public static void main(String[] args) {
        String[] empleados = {"Juan Perez", "Maria Lopez", "Carlos Gomez", "Ana Rodriguez", "Luis Martinez"};

        int[] horasTrabajadas = {40, 35, 45, 38, 42};
        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas){
        int pagoSemanal;

        for (int i=0; i< empleados.length;i++){
            pagoSemanal = horasTrabajadas[i] * 15;
            System.out.println(empleados[i] + " recibe un sueldo semanal de $" + pagoSemanal);
        }
    }
}
