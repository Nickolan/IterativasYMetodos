import javax.swing.*;

public class EjemploWhile {
    public static void main(String[] args) {
        String password="", contrasenia = "UTN";
        int intentos = 0;
        while (!password.equals(contrasenia) && intentos<3){
            password=JOptionPane.showInputDialog("Ingrese su contraseña");
            intentos++;
            password=password.toUpperCase();
            if (!password.equals(contrasenia)){
                JOptionPane.showMessageDialog(null, "Pass incorrecta, llevas " + intentos + " de 3 intentos");
            }
        }
        if (intentos==3 && !password.equals(contrasenia)){
            JOptionPane.showMessageDialog(null, "Te quedaste sin intentos");
            return;
        } else if (password.equals(contrasenia)) {
            JOptionPane.showMessageDialog(null, "Acceso concedido");
            return;
        }
    }

}
