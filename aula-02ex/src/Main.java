public class Main {
    public static void main(String[] args) {
        Celular samsung = new Celular();
        samsung.fabricante = "Samsung";
        samsung.sistemaOperacional = "Android";
        samsung.cor = "Preto";
        samsung.ligado = true;
        samsung.getStatus();
        samsung.setLigado();
        samsung.getStatus();

        Aula aula = new Aula();
        aula.nome = "Calculo 1";
        aula.duracao = 30;
        aula.getStatus();
        aula.cancelarAula();
        aula.getStatus();
    }
}
