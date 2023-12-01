public class Repositorio{

    /* variables */
    private Carta BD[];
    private int indice;

    /* constructor */
    public Repositorio() {
        BD = new Carta[6];
        indice = 0;
    }

    /* insert method */
    public void insert(Carta c) {
        for (int i = 0; i < indice; i++) {
            if ((BD[i].valor.equalsIgnoreCase(c.valor)) & (BD[i].naipe.equalsIgnoreCase(c.naipe))) {
                System.out.println("As Cartas são Iguais");
            } else {
                BD[indice] = c;
                indice++;
            }
        }
    }

    /* remove method */
    public void remove(Carta c) {
        for (int i = 0; i < indice; i++) {
            if (BD[i] == c) {
                BD[i] = BD[indice - 1];
                BD[indice - 1] = null;
                indice--;
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < indice; i++) {
            BD[i].print();
        }
    }
}
