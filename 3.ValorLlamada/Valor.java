import javax.swing.JOptionPane;

public class Valor{
  public static void main(String[] args){
    float tiempoLlamada;
    float valorLlamada;

    tiempoLlamada = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo de la llamada"));

    if(tiempoLlamada>3)
    {
      valorLlamada = 300 + 50*(tiempoLlamada-3);
    }
    else
    {
      valorLlamada = 300;
    }

    JOptionPane.showMessageDialog(null, "El valor de la llamada es: " + valorLlamada);
  }
}
