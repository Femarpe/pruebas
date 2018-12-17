import javax.swing.*;

public class floydconfinal {
    public static void main(String[] args) {

        int numerointroducido = 100;
        int valorcreciente = 0;

        String valorposicionado, salida;

         //= Integer.parseInt( JOptionPane.showInputDialog("intodice un numero"));

        salida = "";

        for (int i = 0; i < numerointroducido; i++) {

            valorposicionado = "";

            for (int j = 0; j < i; j++) {

                valorcreciente++;

                valorposicionado += " " + valorcreciente;
            }
            salida += valorposicionado;

            salida += "\n";

        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
