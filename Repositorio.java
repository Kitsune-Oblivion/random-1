public class Repositorio{
    private Carta BD[];
    private int indice;
    private Comparacao cm;


    public Repositorio() {
        BD = new Carta[28];
        indice = 0;
        cm = new Comparacao();
    }

    public void inserir(Carta c) {
        for (int i = 0; i < indice; i++) {
            if ((cm.numeroValor(BD[i]) == cm.numeroValor(c)) & (cm.numeroNaipe(BD[i])) == (cm.numeroNaipe(c))) {
                System.out.println("Cartas Iguais");
            } else {
                BD[indice] = c;
                indice++;
                System.out.println("Carta dada");
            }
        }
    }
}
