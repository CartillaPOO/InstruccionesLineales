import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args)
    {
        //
        // Declaración de variables
        //

        int opcion;

        // Input
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero del 1 al 9"));

        // Processing y Output
        switch(opcion)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "UNO");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "DOS");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "TRES");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "CUATRO");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "CINCO");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "SEIS");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "SIETE");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "OCHO");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "NUEVE");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no válida");
        }

    System.exit(0); // Termina la ejecución del programa
    }
}