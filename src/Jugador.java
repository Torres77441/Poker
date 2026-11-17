public class Jugador {
    public String name;
    private Carta[] cartas;
    private int numCartas;

    public Jugador(String name){
        this.name = name;
        numCartas = 0;
        cartas = new Carta[20];
        for(int i = 0; i < cartas.length; i++){
            cartas[i] = null;
        }
    }


    public void recibirCarta(Carta carta){
        cartas[numCartas] = carta;
        numCartas++;
    }

    public int getPuntuacion(){
        int puntuacion = 0;
        for (int i = 0; i < numCartas ; i++){
            int num = cartas[i].getNumero();
            if (num >= 2 && num <=10){
                puntuacion += num;
            }else{
                if(num >10){
                    puntuacion += 10;
                }else{
                    puntuacion += 11;
                    if (puntuacion > 21){
                        puntuacion -= 10;
                    }
                }
            }
        }
        return puntuacion;
    }

    @Override
    public String toString() {
        String s = "";
        boolean first = true;
        for(int i = 0; i < numCartas ; i++){
            if (first){
                s += cartas[i];
                first = false;
            }else{
                s += ", " + cartas[i];
            }
        }
        return name + ": " + s;
    }
}
