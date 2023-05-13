package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args)
    {
        /*Declaración
         * de
         * variables
        */
        int x;
        int y;
        int z;

        // input
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite y: "));

        // processing
        z = x + y;

        // output
        JOptionPane.showMessageDialog(null, "La suma de " + x + " + " + y + " es: " + z, "Suma enteros", JOptionPane.ERROR_MESSAGE);
        // PLAIN_MESSAGE para no mostrar ícono

        System.exit(0);
    }
}