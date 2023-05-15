public class Test
{
    public static void main(String[] args)
    {
        int n = (int)(Math.random()*6+1);
        // Math.random() devuelve un número aleatorio entre 0 y 1
        // Y al multiplicarlo por 6, nos da un número entre 0 y 6
        // Pero como queremos un número entre 1 y 6, le sumamos 1
        
        System.out.println(n);
    }
}
