public class Main {
    public static void main(String[] args) {
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        l.emitirSom();
        c.emitirSom();

        c.reagir("agradavel");
        c.reagir("m");
        c.reagir(true);
        c.reagir(0);
    }
}