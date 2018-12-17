import javax.swing.*;
import java.sql.SQLOutput;

public class dados {
    public static void main(String[] args) {

        int numerodecaras;
        numerodecaras=6;
        //numerodecaras=Integer.parseInt(JOptionPane.showInputDialog( "introduce el numero de caras que necesiitas" ));
        String posibleresultado="";
        String resultado="";
        String salida="";
        for (int i = 1; i <= numerodecaras; i++) {
            resultado += "\n";
            for (int j = 1; j <= numerodecaras ; j++) {
                resultado +=  i + " ";
                resultado += j + "\n";

            }
        }
        JOptionPane.showMessageDialog( null, resultado );
    }
}
