public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String especialidade, double salario) {
        super.setNome(nome);
        super.setIdade(idade);

        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void receberAumento(int quantidade) {
        this.setSalario(this.getSalario() + quantidade);
    }
}
