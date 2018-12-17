import javax.swing.*;
import java.util.jar.JarOutputStream;

public class sumarconbucle {
    public static void main(String[] args) {
        int suma=0;
        for (int i=0;i<5;i++){
            int numerointroducido=Integer.parseInt(JOptionPane.showInputDialog("Numero"+(i+1)));
            suma+=numerointroducido;


        }
        System.out.println(suma);
    }
}

