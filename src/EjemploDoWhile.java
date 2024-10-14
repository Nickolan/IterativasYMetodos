import javax.swing.*;
import java.util.Random;

public class EjemploDoWhile {
    public static void main(String[] args) {
        int nota, intentos = 0;
        Random numRandom = new Random();
        do {
            JOptionPane.showMessageDialog(null, "Tenes " + (4-intentos) + " intentos");
            intentos++;
            nota = numRandom.nextInt(1,11);

            if (nota >=6){
                JOptionPane.showMessageDialog(null, "Aprobadisimo con " + nota);
                break;
            }
            JOptionPane.showMessageDialog(null, "Sacaste un " + nota);
        }while(intentos <4);
    }
}
