package Src;

public class Mate {
    String cadena2 = "mate";
    String cadena3 = "mate";
    String cadena4 = new String("mate");

    boolean esIgual() {
        if (cadena2==(cadena3)) {
            return true;
        }

        return false;
    }
    boolean esIgual2(){
        if (cadena2==(cadena4)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Mate mateObjeto = new Mate();

        if (mateObjeto.esIgual()) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas no son iguales.");
        }
    }
}
