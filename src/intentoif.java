import javax.swing.*;

public class intentoif {
    public static void main(String[] args) {

        int edad=Integer.parseInt(JOptionPane.showInputDialog("¿edad?"));
        if(edad>=18) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("insensato");

        }

    }
}
