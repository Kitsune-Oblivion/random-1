public class Carta {
    protected String valor;
    protected String naipe;

    public Carta(String valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public void printC() {
        System.out.println("Valor da carta: " + valor);
        System.out.println("Naipe da carta:" + naipe);
    }
}
