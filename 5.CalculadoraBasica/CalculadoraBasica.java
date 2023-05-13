import javax.swing.JOptionPane;

public class CalculadoraBasica
{
    public static void main(String[] args)
    {
        // Declaración de variables
        double x, y;
        int opcion;
        boolean bandera;

        // Entrada
        JOptionPane.showMessageDialog(null, "CALCULADORA BASICA\n\n1. Ingrese los valores para x e y.\n2. Seleccione la operacion a realizar");
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "OPERACIONES:\n\n1. Suma.\n2. Resta\n3. Multiplicacion\n4. División\n5. Potencia\n6. Logaritmo"));

        // Procesamiento
        switch(opcion)
        {
            case 1:
                // Suma
                JOptionPane.showMessageDialog(null, "La suma es: "+  (x+y));
                break;
            case 2:
                // Resta
                JOptionPane.showMessageDialog(null, "La suma es: ");
            default:
                //Otros casos
                JOptionPane.showMessageDialog(null, "Opcion no válida");
        }

        // Salida

        // Fin
        System.exit(0);
    }
}