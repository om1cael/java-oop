public class Aluno extends Pessoa {
    private boolean matr;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String curso) {
        super.setNome(nome);
        super.setIdade(idade);
        super.setSexo(sexo);

        this.curso = curso;
        this.matr = true;
    }

    public void cancelarMatr() {
        System.out.println("Cancelando matrícula de " + super.getNome());
        setMatr(false);
    }

    public boolean isMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
