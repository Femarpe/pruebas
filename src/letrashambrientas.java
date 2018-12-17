import javax.swing.*;

public class letrashambrientas {
    public static void main(String[] args) {
        String entrada;
        entrada = JOptionPane.showInputDialog("introduce una frase");
        //String hambrienta;
        //hambrienta = JOptionPane.showInputDialog( "introduce una letra" );

        for (int i = 0; i <= entrada.length() ; i++) {
            JOptionPane.showMessageDialog(null, entrada.charAt( i ));

        }

    }
}
