public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Marcos", "ADS");
        Visitante visitante = new Visitante();
        Bolsista bolsista = new Bolsista("Paulo", "Fisica Nuclear");
        Tecnico tecnico = new Tecnico("Marcus", "Fisica", "A1");
        Professor professor = new Professor("Alexandre", "Fisica", 4800.4f);
        visitante.setNome("Rafael");

        System.out.println(aluno.toString());
        System.out.println(visitante.toString());
        System.out.println(bolsista.toString());
        System.out.println(tecnico.toString());
        System.out.println(professor.toString());

        bolsista.pagarMensalidade();
        aluno.pagarMensalidade();
    }
}