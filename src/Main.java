import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");
        Date comienzoDeCursada = new Date(2022, 7, 18);
        Date finDeCursada = new Date(2022, 11, 5);
        Date fechaParcial = new Date(2022, 8, 29);

        Season torneoDaVinci = new Season(
            "Torneo 2022, 2do cuatri",
            comienzoDeCursada,
            finDeCursada
        );



        Team profesPoo = new Team("Profes POO");
        profesPoo.addPlayer(new Player("Sergio Medina", "Goalkeeper"));
        profesPoo.addPlayer(new Player("Jose", "Defender"));
        profesPoo.addPlayer(new Player("Miguel", "Defender"));
        profesPoo.addPlayer(new Player("Roberto", "Defender"));
        profesPoo.addPlayer(new Player("Maria", "Defender"));



        Team estudiantesPoo = new Team("Estudiantes POO");
        estudiantesPoo.addPlayer(new Player("Santi Verellen", "Goalkeeper"));
        estudiantesPoo.addPlayer(new Player("Nicolas", "Defender"));
        estudiantesPoo.addPlayer(new Player("Francisco", "Defender"));
        estudiantesPoo.addPlayer(new Player("Matias", "Defender"));
        estudiantesPoo.addPlayer(new Player("Luciano", "Defender"));

        Match primerParcial = new Match(
            "Aula 116",
            fechaParcial,
            profesPoo,
            estudiantesPoo
        );

    }
}
