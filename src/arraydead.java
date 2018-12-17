import javax.swing.*;

public class arraydead {
    public static void main(String[] args) {

        String nombre[] = {"pascu", "rodri", "mario", "estela", "link", "Zelda", "Midna",  "Winlow",  "Winlow"};

        int salida=0;
        int i;
        for (i = 0; i < nombre.length; i++){
            System.out.println( nombre[i] );
            salida = i + 1 ;
            }
        System.out.println( i );
        JOptionPane.showMessageDialog( null, salida );
    }

}
