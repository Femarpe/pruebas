import javax.swing.*;
import java.util.jar.JarOutputStream;

public class dadosdominorol {
    public static void main(String[] args) {
        String eleccion;
        eleccion = JOptionPane.showInputDialog( "selecciona entre 'dado', 'rol' o 'domino' " );


        if (eleccion.equals( "dado" )) {
            int carasdado;
            carasdado = 6;
            String resultadodado = "";
            for (int i = 1; i <= carasdado; i++) {
                resultadodado += "\n";
                for (int j = 1; j <= carasdado; j++) {
                    resultadodado += i + " ";
                    resultadodado += j + "\n";
                }
            }
            JOptionPane.showMessageDialog( null, resultadodado );
        } else if (eleccion.equals( "rol" )) {

            int numerodecaras;

            numerodecaras = Integer.parseInt( JOptionPane.showInputDialog( "introduce el numero de caras que necesiita\nValidos: 4,6,8,10,12,20,100" ) );
            if (numerodecaras == 4) {
                String resultadorol = "";
                for (int i = 1; i <= numerodecaras; i++) {
                    resultadorol += "\n";
                    for (int j = 1; j <= numerodecaras; j++) {
                        resultadorol += i + " ";
                        resultadorol += j + "\n";

                    }
                }
                JOptionPane.showMessageDialog( null, resultadorol );
            } else if (eleccion.equals( "domino" )) {
                int numeroficha;
                numeroficha = 7;
                String resultadodomino = "";
                for (int i = 0; i <= numeroficha; i++) {
                    resultadodomino += "\n";
                    for (int j = 0; j <= numeroficha; j++) {

                        resultadodomino += i + " ";
                        resultadodomino += j + "\n";
                    }
                }
                JOptionPane.showMessageDialog( null, resultadodomino );
            } else {
                JOptionPane.showMessageDialog( null, "Error" );
            }
        }

    }
}
