import javax.swing.*;

public class minusmayus {
    public static void main(String[] args) {
       String primeroAsaber;
       String segundoAsaber;

       primeroAsaber= JOptionPane.showInputDialog(null,"introduce elprimer caracter");
       segundoAsaber= JOptionPane.showInputDialog(null,"introduce el segundo");

        String primeroMayusculas=primeroAsaber.toLowerCase();
        String segundoMayusculas=segundoAsaber.toUpperCase();

        if (primeroMayusculas.equalsIgnoreCase(segundoMayusculas))
        {
         //   JOptionPane.showMessageDialog("d");

        }

        // char primeroMayusculas=Character.toLowerCase(primeroAsaber);
        // char segundoMayusculas=Character.toLowerCase(segundoAsaber);
    }
}
