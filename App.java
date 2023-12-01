public class App {
    public static void main(String[] args) {
        Carta c1 = new Carta("A", "Ouros");
        Carta c2 = new Carta("4", "Paus");

        Repositorio BD = new Repositorio();

        BD.inserir(c1);
        BD.inserir(c1);
        BD.inserir(c2);
    }
}