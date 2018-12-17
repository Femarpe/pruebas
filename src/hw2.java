import javax.swing.*;

public class hw2 {
    public static void main(String[] args) {
        int numeodelineas, i;
        String salida = "";

        numeodelineas = Integer.parseInt(JOptionPane.showInputDialog("Numero de lineas"));

        for (i = 1; i <= numeodelineas; i++ ){
            salida += i;
            System.out.println(salida);
        }
    }
}
