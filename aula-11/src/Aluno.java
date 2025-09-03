public class Aluno extends Pessoa {
    private boolean matricula;
    private String curso;

    public Aluno(String nome, String curso) {
        super.setNome(nome);

        this.matricula = true;
        this.curso = curso;
    }

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + super.getNome());
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
