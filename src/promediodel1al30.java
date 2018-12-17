public class promediodel1al30 {
    public static void main(String[] args) {
        double acumulador, suma=0;
        for ( acumulador = 1; acumulador <= 30 ; acumulador++) {
            System.out.println(acumulador);
            suma += acumulador;
        }
        System.out.println("\n media = " + suma / 30);
    }
}
