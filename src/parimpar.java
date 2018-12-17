import javax.swing.*;

public class parimpar {
    public static void main(String[] args) {
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("¿Numero?"));
        if (numero%2==0) {
        System.out.println("es par");
        } else {
            System.out.println("es impar");
        }

















        /*int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("¿Numero?"));
        int ultimacifra=numero%10;
switch (ultimacifra){
    case 0:
    case 2:
    case 4:
    case 6:
    case 8:JOptionPane.showMessageDialog(null,"el numero es par");
    break;
    case 1:
    case 3:
    case 5:
    case 7:
    case 9:JOptionPane.showMessageDialog(null,"el numero es impar");
    break;
    }
    }*/
    }}