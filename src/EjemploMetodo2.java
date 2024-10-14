import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class EjemploMetodo2 {
    public static void main(String[] args) {
        int num1, num2;
        float res;
        Random numRandom = new Random();
        num1=leerNumero();
        String op = JOptionPane.showInputDialog("Selecciona la operacion a realizar\n(+)sumar\n(-)restar\n(*)multiplicar\n(/)dividir");
        num2=leerNumero();
        switch (op){
            case "+":
                res = sumar(num1, num2);
                JOptionPane.showMessageDialog(null, "La sumar " + num1 + " y " + num2 + " es igual a " + res);
                break;
            case "-":
                res = restar(num1, num2);
                JOptionPane.showMessageDialog(null, "La restar " + num1 + " y " + num2 + " es igual a " + res);
                break;
            case "*":
                res = multiplicar(num1, num2);
                JOptionPane.showMessageDialog(null, "La multiplicar " + num1 + " por " + num2 + " es igual a " + res);
                break;
            case "/":
                res = dividir(num1, num2);
                JOptionPane.showMessageDialog(null, "La dividir " + num1 + " entre " + num2 + " es igual a " + res);
                break;
            default:
                JOptionPane.showMessageDialog(null, JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
    public static void imprimirHola(String nombre){
        System.out.println("Hola " + nombre);
    }
    public static int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    public static int restar(int numero1, int numero2){
        return numero1 - numero2;
    }
    public static int multiplicar(int numero1, int numero2){
        int mult = numero1 * numero2;
        return mult;
    }
    public static float dividir(int numero1, int numero2){
        return numero1 / numero2;
    }
    public static int leerNumero(){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        return numero;
    }
}
