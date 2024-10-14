package TpIterativas;

import javax.swing.*;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int i=1, ventas, total=0;
        do {
            ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de ventas realizadas el dia " + i));
            total += ventas;
            i++;
        }while(i <= 7);
        JOptionPane.showMessageDialog(null, "En la semana se realizaron " + total + " Ventas");
    }
}
