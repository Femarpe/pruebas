import javax.swing.*;

public class hw1 {
    public static void main(String[] args) {
        int alturapiraamide, i, j, numeroespacios = 0, k;
        String numeroasteriscos;

        alturapiraamide = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));

        for( i = 0; alturapiraamide >= i; alturapiraamide--){
           numeroasteriscos = "";

           for ( k = 0 ; k < numeroespacios; k++) {
               numeroasteriscos += " ";
           }

           for( j = 0; j <((alturapiraamide * 2) + 1); j++){

               numeroasteriscos += "*";

           }
           System.out.println(numeroasteriscos);
           numeroespacios++;
        }

    }
}
