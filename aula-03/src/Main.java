public class Main {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.modelo = "BIC Cristal";
        caneta.cor = "Azul";
        //caneta.ponta = .5f;
        caneta.carga = 80;
        //caneta.tampada = false;
        caneta.destampar();
        caneta.status();
        caneta.rabiscar();


    }
}
