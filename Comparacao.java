public class Comparacao {
    public int numeroNaipe(Carta c) {
        int numNaipe = 0;
        String colecaoNaipe[] = new String[4];
        colecaoNaipe[0] = "ouros";
        colecaoNaipe[1] = "espadas";
        colecaoNaipe[2] = "copas";
        colecaoNaipe[3] = "paus";

        for (int i  = 0; i < 4; i++) {
            if (colecaoNaipe[i].equalsIgnoreCase(c.naipe)) {
                numNaipe = i + 1;
            }
        }
        return numNaipe;
    }

    public int numeroValor(Carta c) {
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

        for (int i = 0; i < 10; i++) {
            if (colecaoValor[i].equalsIgnoreCase(c.valor)) {
                numValor = i + 1;
            }
        }

        return numValor;
    }
}
