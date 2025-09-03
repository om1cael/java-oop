public class Tecnico extends Aluno {
    private String registroProfissional;

    public Tecnico(String nome, String curso, String registroProfissional) {
        super(nome, curso);

        this.registroProfissional = registroProfissional;
    }

    public void praticar() {

    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
