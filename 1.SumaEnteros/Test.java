package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args)
    {
        //
        // Declaración de variables
        //

        int x;
        int y;
        int z;

        // Input
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite y: "));

        // Processing
        z = x + y;

        // Output
        JOptionPane.showMessageDialog(null, "La suma de " + x + " + " + y + " es: " + z, "Suma enteros", JOptionPane.PLAIN_MESSAGE);
        // PLAIN_MESSAGE existe para no mostrar ningún ícono, pero existen íconos como ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE

        System.exit(0); // Termina la ejecución del programa
    }
}