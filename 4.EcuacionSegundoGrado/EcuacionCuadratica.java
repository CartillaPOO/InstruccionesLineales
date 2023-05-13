import javax.swing.JOptionPane;

public class EcuacionCuadratica
{
    public static void main(String[] args)
    {
        // Declaración de variables
        double a, b, c, d;
        double x1, x2;

        // Entrada
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del coeficianete a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del coeficianete b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del coeficianete c"));

        // Procesamiento
        d = b*b - 4*a*c;

        if (d == 0)
        {
            x1 = -b/2*a;
            x2 = x1;
            // Salida
            JOptionPane.showMessageDialog(null, "Raices:\nx1 = " + x1 + "\nx2 = " + x2, "Ecuacion Cuadratica", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if (d>0)
            {
                x1 = (-b + Math.sqrt(d))/(2*a);
                x2 = (-b - Math.sqrt(d))/(2*a);
            // Salida
            JOptionPane.showMessageDialog(null, "Raices:\nx1 = " + x1 + "\nx2 = " + x2, "Ecuacion Cuadratica", JOptionPane.INFORMATION_MESSAGE);

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Raices imaginarias", "Ecuación Cuadrática", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // Fin
        System.exit(0);
    }
}