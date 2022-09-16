import javax.swing.JOptionPane;
/**
 * clase para revisar ciclos
 * 
 * @author (otra prueba) 
 * @version 1.0-2022
 */
public class Usuario
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario()
    {
        // initialise instance variables
        x = 0;
        this.conteo();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void conteo()
    {
        // put your code here
        for (int i=0;i<=10;i++){
            System.out.println("-" + i);
        }
        mensaje();
    }
    
    public static void mensaje(){
        JOptionPane.showMessageDialog(null,"Mensaje con swing", "Mensaje de Warning", JOptionPane.ERROR_MESSAGE);
        int a = Integer.parseInt(JOptionPane.showInputDialog("Cual su edad?"));
        JOptionPane.showMessageDialog(null,"Lo que digitó fue: "+a,"Mensaje de respuesta",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}


