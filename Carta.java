public class Carta {

    /* variables */
    protected String valor;
    protected String naipe;

    /* constructor */
    public Carta(String valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    /* print method */
    public void print() {
        System.out.println("Valor da carta: " + valor);
        System.out.println("Naipe da carta:" + naipe);
    }
}
