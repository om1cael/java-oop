public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];

        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");

        Visualizacao vis = new Visualizacao(g[0], v[2]);
        vis.avaliar(100f);
        System.out.println(vis.toString());
    }
}