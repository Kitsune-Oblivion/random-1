public class App {
    public static void main(String[] args) {
        Carta c1 = new Carta("A", "Ouros");
        Carta c2 = new Carta("4", "Paus");
        Comparacao cm = new Comparacao();

        Repositorio BD = new Repositorio();

        BD.insert(c1);
        BD.insert(c1);
        BD.insert(c2);
        BD.printAll();

        cm.defineVira();
    }
}