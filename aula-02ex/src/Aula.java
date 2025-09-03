public class Aula {
    String nome;
    int duracao;

    void cancelarAula() {
        this.nome = "Cancelada";
        this.duracao = 0;
        System.out.println("Aula cancelada!");
    }

    void getStatus() {
        System.out.println("Nome da Aula: " + nome);
        System.out.println("Duração: " + duracao + "m");
    }
}
