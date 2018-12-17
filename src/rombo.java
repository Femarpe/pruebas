import javax.swing.*;

public class rombo {
    public static void main(String[] args) {
        int alturapiraamide, i, j, numeroespacios = 0, k, numeroespacios1 = 0;
        String numeroasteriscos;

        alturapiraamide = Integer.parseInt( JOptionPane.showInputDialog("Introduce altura"));
        numeroespacios1 = alturapiraamide;


        for( i = 0; alturapiraamide <= i; alturapiraamide++){
            numeroasteriscos = "";

            for ( k = 0 ; k < numeroespacios1; k++) {
                numeroasteriscos += " ";
            }

            for( j = 0; j <((alturapiraamide / 2) + 1); j++) {

                numeroasteriscos += "*";

            }
            //}
            //numeroasteriscos =numeroasteriscos;
       // for( i = 0; alturapiraamide >= i; alturapiraamide--){
            

         //   for ( k = 0 ; k < numeroespacios; k++) {
           //     numeroasteriscos += " ";
            //}

            //for( j = 0; j <((alturapiraamide * 2) + 1); j++){

             //   numeroasteriscos += "*";

            //}
            System.out.println(numeroasteriscos);
            numeroespacios++;
        }

    }
}

