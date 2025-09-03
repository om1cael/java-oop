public class Bolsista extends Aluno {
    private boolean bolsa;

    public Bolsista(String nome, String curso) {
        super(nome, curso);

        this.bolsa = true;
    }

    public void renovarBolsa() {
        this.setBolsa(true);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade bolsista de " + super.getNome());
    }

    public boolean isBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }
}
