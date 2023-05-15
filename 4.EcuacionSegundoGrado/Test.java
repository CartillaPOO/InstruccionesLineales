import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args)
    {
        //
        // Declaración de variables
        //

        double a, b, c, d;
        double x1, x2;

        // Input
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del coeficiente a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del coeficiente b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del coeficiente c"));

        // Processing
        d = Math.pow(b, 2) - 4*a*c;

        if(d == 0)
        {
            x1 = -b/(2*a);

            // Output
            JOptionPane.showMessageDialog(null, "Raíz:\nx = " + x1, "Ecuación Cuadrática", JOptionPane.INFORMATION_MESSAGE);
            // "Ecuación Cuadrática" es el título de la ventana, mientras que INFORMATION_MESSAGE es el ícono que se muestra
        }

        else
        {
            if(d>0)
            {
                x1 = (-b + Math.sqrt(d))/(2*a);
                x2 = (-b - Math.sqrt(d))/(2*a);

            // Output
            JOptionPane.showMessageDialog(null, "Raíces:\nx1 = " + x1 + "\nx2 = " + x2, "Ecuación Cuadrática", JOptionPane.INFORMATION_MESSAGE);
            }

            else
            {
                JOptionPane.showMessageDialog(null, "Las raíces son imaginarias", "Ecuación Cuadrática", JOptionPane.ERROR_MESSAGE);
            }
            // Existen otros tipos de mensajes, como WARNING_MESSAGE, ERROR_MESSAGE, etc. Para que no haya ícono, se usa PLAIN_MESSAGE
        }

        System.exit(0); // Termina la ejecución del programa
    }
}