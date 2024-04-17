import io.araf.screenmatch.calculos.CalculadoraDeTiempo;
import io.araf.screenmatch.calculos.FiltroRecomendacion;
import io.araf.screenmatch.modelos.Episodio;
import io.araf.screenmatch.modelos.Pelicula;
import io.araf.screenmatch.modelos.Serie;

import java.util.ArrayList;

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

        String separador = "***********";
        System.out.println(separador);

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(50);

        casaDragon.muestraFichaTecnica();

        System.out.println(separador);

        Pelicula matrix = new Pelicula();
        matrix.setNombre("Matrix");
        matrix.setFechaDeLanzamiento(1998);
        matrix.setDuracionEnMinutos(180);
        matrix.setIncluidoEnPlan(true);
        matrix.muestraFichaTecnica();

        System.out.println(separador);
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(matrix);
        System.out.println("Tiempo total de mi lista: " + calculadora.getTiempoTotal() + "min");

        System.out.println(separador);
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Los herederos del dragon");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);

        var peliculaDeAra = new Pelicula();
        peliculaDeAra.setNombre("El señor de los anillos");
        peliculaDeAra.setDuracionEnMinutos(180);
        peliculaDeAra.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeAra);
        listaDePeliculas.add(matrix);
        listaDePeliculas.add(miPelicula);
        System.out.println("Tamaño de mi array: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

    }
}
