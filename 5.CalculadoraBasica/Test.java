import javax.swing.JOptionPane;

public class Test
{
    // Método principal
    public static void main(String[] args)
    {
        //
        // Declaración de variables
        //

        double x, y;
        int opcion;

        // Input
        JOptionPane.showMessageDialog(null, "CALCULADORA BÁSICA\n\n1. Seleccione la opción a realizar.\n2. Ingrese los valores de X y Y.");
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "OPERACIONES:\n\n1. Suma (x + y)\n2. Resta (x - y)\n3. Multiplicación (x * y)\n4. División (x / y)\n5. Potencia (x ^ y)\n6. Logaritmo natural (ln(x))\n\nSeleccione la opción a realizar: "));
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));

        // Processing y Output
        switch(opcion)
        {
            case 1:
                // Suma
                JOptionPane.showMessageDialog(null, "La suma es: "+  (x+y));
                break;
            case 2:
                // Resta
                JOptionPane.showMessageDialog(null, "La suma es: ");
                case 3:
                JOptionPane.showMessageDialog(null, "La multiplicación es: "+  (x*y));
                break;
            case 4:
                // División
                if(y == 0)
                {
                    JOptionPane.showMessageDialog(null, "La división es indeterminada");
                    break;
                }
                JOptionPane.showMessageDialog(null, "La división es: "+  (x/y));
                break;
            case 5:
                // Potencia
                JOptionPane.showMessageDialog(null, "La potencia es: "+  (Math.pow(x, y)));
                break;
            case 6:
                // Logaritmo natural
                JOptionPane.showMessageDialog(null, "El logaritmo es: "+  (Math.log(x)));
            default:
                //Otros casos
                JOptionPane.showMessageDialog(null, "Opcion no válida");
        }

        System.exit(0); // Termina la ejecución del programa
    }
}