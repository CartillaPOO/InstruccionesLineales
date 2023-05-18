import javax.swing.JOptionPane;

public class Test
{
    // Método principal
    public static void main(String[] args)
    {
        //
        // Declaración de variables
        //

        float tiempoLlamada;
        float valorLlamada;

        // Input
        tiempoLlamada = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo de la llamada"));

        // Processing
        if(tiempoLlamada>3)
        {
            valorLlamada = 300 + 50*(tiempoLlamada-3);
        }
        else
        {
            valorLlamada = 300;
        }
        
        // Output
        JOptionPane.showMessageDialog(null, "El valor de la llamada es: " + valorLlamada);
    
        System.exit(0); // Termina la ejecución del programa
    }
}
