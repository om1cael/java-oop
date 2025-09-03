public class Celular {
    String fabricante;
    String sistemaOperacional;
    String cor;
    boolean ligado;

    void getStatus() {
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("OS: " + this.sistemaOperacional);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ligado: " + this.ligado);
    }

    void setLigado() {
        this.ligado = !this.ligado;
    }
}
