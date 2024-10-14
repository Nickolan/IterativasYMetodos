package TpIterativas;

import javax.swing.*;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int i=1, empleados, horas, tarifa;
        empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de empleados"));
        while(i <= empleados){
            horas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de horas trabajadas por el empleado " + i));
            tarifa = horas * 15;
            JOptionPane.showMessageDialog(null, "La tarifa del empleado " + i + ", es de $" + tarifa);
            i++;
        }
    }
}
