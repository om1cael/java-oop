public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String setor) {
        super.setNome(nome);
        super.setIdade(idade);
        this.setor = setor;

        this.trabalhando = true;
    }

    public void mudarTrabalho() {
        this.setTrabalhando(!this.isTrabalhando());
        System.out.println("Trabalhando: " + this.isTrabalhando());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
