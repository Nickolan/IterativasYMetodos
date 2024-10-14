package TpIterativas;

import javax.swing.*;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int horasEstudio, horasEjercicio, horaLeer, horaLibre, total=0, horas=0;
        String opcion;
        for (int i = 0; i < 4; i++){
            opcion = JOptionPane.showInputDialog("Ingrese la actividad:\nEstudio\nEjercicio\nLectura\nLibre");
            horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la horas que quiere utilizar"));

            switch (opcion){
                case "Estudio":
                    horasEstudio = horas;
                    break;
                case "Ejercicio":
                    horasEjercicio = horas;
                    break;
                case "Lectura":
                    horaLeer = horas;
                    break;
                case "Libre":
                    horaLibre = horas;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esa opcion no estaba disponible");
                    break;
            }
            total += horas;
        }
        JOptionPane.showMessageDialog(null, "Las horas totales usadas son " + total);
    }
}
