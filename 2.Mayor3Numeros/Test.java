import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        // Declaración de variables
        int x, y, z, mayor;
        mayor = 0;
        
        // Entrada
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el vaalor de x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el vaalor de y: "));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite el vaalor de z: "));
        
        // Procesamiento
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

        // Salida
        JOptionPane.showMessageDialog(null, "El mayor es " + mayor);

        // Fin
        System.exit(0);

        
    }
}