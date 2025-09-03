public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    public void reagir(String frase) {
        if(frase.equalsIgnoreCase("agradavel")) {
            System.out.println("abanar e latir");
        } else {
            System.out.println("rosnar");
        }
    }
    public void reagir(char horario) {
        if(horario == 'm') System.out.println("abanar");
        else if(horario == 't') System.out.println("abanar e latir");
        else System.out.println("ignorar");
    }
    public void reagir(boolean dono) {
        if(dono) System.out.println("abanar");
        else System.out.println("rosnar e latir");
    }
    public void reagir(int tipo) {
        if(tipo == 0) System.out.println("abanar");
        else if(tipo == 1) System.out.println("latir");
        else if(tipo == 2) System.out.println("rosnar");
        else if(tipo == 3) System.out.println("ignorar");
    }
}
