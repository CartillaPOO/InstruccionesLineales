import javax.swing.JOptionPane;

public class Test
{
    // Método principal
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
        JOptionPane.showMessageDialog(null, "La suma de " + x + " + " + y + " es: " + z);

        System.exit(0); // Termina la ejecución del programa
    }
}