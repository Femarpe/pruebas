import javax.swing.*;

public class hw3 {
    public static void main(String[] args) {
        double numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("intruduce un numero"));
        while (numero != 1){

            if (numero %2 == 0){
                numero  = numero / 2;
            }
            else{
                numero = ((numero * 3) + 1);
            }
            System.out.println(numero);
        }
        System.out.println("Finalizado");
    }
}
