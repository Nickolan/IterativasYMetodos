package TpIterativas;

import javax.swing.*;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int empleados, horasTrabajadas, horasExtra;
        empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de empleados"));
        for (int i = 1; i <= empleados; i++){
            horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas trabajo durante la semana el empleado " + i));
            if (horasTrabajadas > 40){
                horasExtra = horasTrabajadas - 40;
                JOptionPane.showMessageDialog(null, "El empleado " + i + " ha trabajado "+horasExtra+" horas extra");
            }
        }
    }
}
