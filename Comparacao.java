import java.util.Random;

public class Comparacao {

    /* "naipe" comparing method */
    public int numeroNaipe(Carta c) {
        
        /* local variables */
        int numNaipe = 0;
        String colecaoNaipe[] = new String[4];
        colecaoNaipe[0] = "ouros";
        colecaoNaipe[1] = "espadas";
        colecaoNaipe[2] = "copas";
        colecaoNaipe[3] = "paus";

        /* here's the magic */
        for (int i  = 0; i < 4; i++) {
            if (colecaoNaipe[i].equalsIgnoreCase(c.naipe)) {
                numNaipe = i + 1;
            }
        }
        return numNaipe;
    }

    /* value comparing method */
    public int numeroValor(Carta c) {

        /* local variables */
        int numValor = 0;
        String colecaoValor[] = new String[10];
        colecaoValor[0] = "4";
        colecaoValor[1] = "5";
        colecaoValor[2] = "6";
        colecaoValor[3] = "7";
        colecaoValor[4] = "Q";
        colecaoValor[5] = "J";
        colecaoValor[6] = "K";
        colecaoValor[7] = "A";
        colecaoValor[8] = "2";
        colecaoValor[9] = "3";

        /* here's the magic */
        for (int i = 0; i < 10; i++) {
            if (colecaoValor[i].equalsIgnoreCase(c.valor)) {
                numValor = i + 1;
            }
        }

        return numValor;
    }

    /* "vira" defining method */
    public int defineVira() {

        /* local variables */
        int numVira = 0;
        Random rn = new Random();
        int defVira = rn.nextInt(9) +0;
        String vira[] = new String[10];
        vira[0] = "4";
        vira[1] = "5";
        vira[2] = "6";
        vira[3] = "7";
        vira[4] = "Q";
        vira[5] = "J";
        vira[6] = "K";
        vira[7] = "A";
        vira[8] = "2";
        vira[9] = "3";

        for (int i = 0; i < 10; i++) {
            if (i == defVira) {
                System.out.println("O vira é o: " + vira[i]);
                numVira = i+1;
            }
        }

        return numVira;
    }
}
