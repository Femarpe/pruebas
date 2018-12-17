import javax.swing.*;

public class divisores {
    public static void main(String[] args) {
        int numero;

        String salida = "";

        numero = Integer.parseInt( JOptionPane.showInputDialog( "introduce un numero" ) );
        while (numero < 0) {

            System.out.println( "mal" );
            numero = Integer.parseInt( JOptionPane.showInputDialog( "introduce un numero" ) );
        }

        int resultado = 0;
        for (int i = 2; i < numero; i++) {


            resultado = numero % i;


            if (resultado == 0) {
                salida += (i + " ");
            }


        }
        JOptionPane.showMessageDialog(null, salida );
    }

}



