public class Carta {

    private int numero;
    private String palo;
    public static final String[] PALOS = {"♠", "♥", "♦", "♣"};


    public Carta(int numero,String palo) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        String s = "";
        if (numero == 11){
            s = "J";
        }else if (numero == 12){
            s = "Q";
        }else if (numero == 13){
            s = "K";
        }else {
            s += numero;
        }

        s += " de " + palo + ", ";
        return s;
    }
}
