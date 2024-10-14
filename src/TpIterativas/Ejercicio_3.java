package TpIterativas;

import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int i=1, productos, cantidad;
        productos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de productos"));
        while(i <= productos){
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad disponibles en el producto " + i));
            if (cantidad <=5){
                JOptionPane.showMessageDialog(null, "Debes hacer un pedido para reponer este producto");
            }
            i++;
        }
    }
}
