import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        //
        // Declaración de variables
        //  

        int x, y, z, mayor;
        mayor = 0;
        
        // Input
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de y: "));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de z: "));
        
        // Processing
        if (x>y)
        {
            if (x>z)
            {
                mayor = x;
            }
            else
            {
                mayor = z;
            }
        }

        else if (y>z)
        {
            if (y>x)
            {
                mayor = y;
            }
            else
            {
                mayor = x;
            }
        }

        // Output
        JOptionPane.showMessageDialog(null, "El mayor es " + mayor);

        System.exit(0); // Termina la ejecución del programa
    }
}