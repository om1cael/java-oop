public class Main {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.cor = "Azul";
        caneta.ponta = .5f;
        caneta.tampar();
        caneta.rabiscar();
        caneta.status();
        caneta.destampar();
        caneta.status();

        caneta.rabiscar();

        Caneta canetaPreta = new Caneta();
        canetaPreta.modelo = "Hostnet";
        canetaPreta.cor = "Preta";
        canetaPreta.destampar();
        canetaPreta.rabiscar();
        canetaPreta.status();
    }
}
