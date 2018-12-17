import javax.swing.*;

public class unocontrol {


   /* public static void main(String[] args) {
        int numerioinicial=Integer.parseInt(JOptionPane.showInputDialog("primer valor"));
        int numerofinal=Integer.parseInt(JOptionPane.showInputDialog("segundo valor"));
        String salida;
      }
    }*/






    public static void main(String[] args) {
        int entrnumeros=0;
        for (int i=0;i<2;i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("digito" + (i + 1)));
            entrnumeros += numero;


            System.out.println(entrnumeros);

        }
    }

}

