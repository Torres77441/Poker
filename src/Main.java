import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mazo m = new Mazo(3);
        m.barajar();
        Jugador p1 = new Jugador("Derek");
        boolean terminar = false;
        int dealer;
        int d1 = (int) (Math.random() * 11 + 1);
        int d2 = (int) (Math.random() * 11 + 1);
        dealer = d1 + d2;
        if (dealer > 21){
            dealer = 21;
        }
        for (int i = 1 ; i <= 2; i++){
            p1.recibirCarta(m.extraerCarta());
        }
        while (!terminar){
            System.out.println("---JUGADOR---");
            System.out.println(p1);
            System.out.println(p1.getPuntuacion());
            System.out.println("---DEALER---");
            System.out.println("Dealer tiene:  x + " + d2 );
            System.out.println("Otra carta?    Y/N");
            String seguir = "";
            seguir = input.nextLine().toUpperCase();
            System.out.println();
            System.out.println();
            if (seguir.equals("Y")){
                p1.recibirCarta(m.extraerCarta());
                System.out.println(p1);
                System.out.println(p1.getPuntuacion());
                System.out.println();
                System.out.println();
                if (p1.getPuntuacion() > 21){
                    System.out.println("HAS PERDIDO!!!!");
                    System.out.println("Total jugador: " + p1.getPuntuacion());
                    System.out.println("Dealer total: "+dealer  );
                    terminar = true;
                }
            }else{
                if(dealer > p1.getPuntuacion()){
                    System.out.println("HAS PERDIDO");
                    System.out.println("Total jugador: " + p1.getPuntuacion());
                    System.out.println("Dealer total: "+dealer  );
                    terminar = true;
                }else if (dealer < p1.getPuntuacion()){
                    System.out.println("GANASTEEEE");
                    System.out.println("Total jugador: " + p1.getPuntuacion());
                    System.out.println("Dealer total: "+dealer  );
                    terminar = true;
                }else if (dealer == p1.getPuntuacion()){
                    System.out.println("EMPATE");
                    System.out.println("Total jugador: " + p1.getPuntuacion());
                    System.out.println("Dealer total: "+dealer );
                    terminar = true;
                }
            }
        }
    }
}
