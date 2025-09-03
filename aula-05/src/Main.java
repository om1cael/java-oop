public class Main {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco(0, "CC", "Rafael");
        pessoa1.abrirConta();

        ContaBanco pessoa2 = new ContaBanco(1, "CP", "Maria");
        pessoa2.abrirConta();

        pessoa1.depositar(100);
        pessoa2.depositar(500);
        pessoa2.sacar(1000);

        pessoa1.sacar(150);
        pessoa1.fecharConta();

        pessoa1.estadoAtual();
        pessoa2.estadoAtual();
    }
}