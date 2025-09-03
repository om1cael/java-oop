import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equalsIgnoreCase(l2.getCategoria())
        && l1 != l2) {
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        } else {
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }

    public void lutar() {
        if(!aprovada) return;

        desafiante.apresentar();
        desafiado.apresentar();

        int vencedor = new Random().nextInt(0, 2);

        if(vencedor == 0) {
            desafiante.empatarLuta();
            desafiado.empatarLuta();

            System.out.println("Houve um empate.");
            desafiante.status();
            desafiado.status();
        } else if(vencedor == 1) {
            desafiado.ganharLuta();
            desafiante.perderLuta();

            System.out.println("Quem ganhou foi: " + desafiado.getNome());
            desafiado.status();
        } else {
            desafiante.ganharLuta();
            desafiado.perderLuta();

            System.out.println("Quem ganhou foi: " + desafiante.getNome());
            desafiante.status();
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
