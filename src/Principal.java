import io.araf.screenmatch.modelos.Pelicula;
import io.araf.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2022);
        miPelicula.setDuracionEnMinutos(160);

        miPelicula.evalua(7.5);
        miPelicula.evalua(10);
        miPelicula.evalua(8.3);

        miPelicula.muestraFichaTecnica();
        System.out.println(miPelicula.getCantidadDeEvaluaciones());
        System.out.println("Evaluacion: " + miPelicula.calculaMedia());

        System.out.println("***********");

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(50);

        casaDragon.muestraFichaTecnica();

    }
}
