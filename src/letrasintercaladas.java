 import javax.swing.*;

    public class letrasintercaladas {
        public static void main(String[] args) {
            String entrada;
            String lineaArriba = "";
            String lineaAbajo = "";
            entrada = JOptionPane.showInputDialog("escribe aqui");
            int NumeroCaracteres = entrada.length();

            for (int i = 0; i < NumeroCaracteres; i++) {

                //System.out.println(entrada.charAt(i));

                if (i % 2 == 0){
                    lineaArriba += entrada.charAt(i);
                    lineaAbajo += " ";
                }
                else {
                    lineaArriba += " ";
                    lineaAbajo += entrada.charAt(i);
                }
            }
            System.out.println(lineaArriba);
            System.out.println(lineaAbajo);
            //JOptionPane.showMessageDialog( null, lineaArriba + "\n" + lineaAbajo );
        }
    }
