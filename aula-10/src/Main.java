public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Marcos", 18, "M", "ADS");
        Professor professor = new Professor("Matheus", 48, "Informática", 4890.20);
        Funcionario funcionario = new Funcionario("Rafaela", 24, "Coordenação");

        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(funcionario.toString());
    }
}