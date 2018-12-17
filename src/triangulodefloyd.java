import javax.swing.*;
import java.util.jar.JarOutputStream;

public class triangulodefloyd {
    public static void main(String[] args) {

        int numerointroducido;
        int i;
        int j;
        int valorcreciente = 0;

        String valorposicionado, salida;

        numerointroducido = Integer.parseInt(JOptionPane.showInputDialog("intodice un numero"));

        salida = "";

        for (i = 0; i < numerointroducido; i++) {

            valorposicionado = "";

            for (j = 0; j < i; j++) {

                valorcreciente++;

                valorposicionado += " " + valorcreciente;
            }
            salida += valorposicionado;

            salida += "\n";

        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
