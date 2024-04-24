package io.araf.screenmatch.Principal;

import io.araf.screenmatch.calculos.CalculadoraDeTiempo;
import io.araf.screenmatch.calculos.FiltroRecomendacion;
import io.araf.screenmatch.modelos.Episodio;
import io.araf.screenmatch.modelos.Pelicula;
import io.araf.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2022);
        miPelicula.setDuracionEnMinutos(160);

        miPelicula.evalua(7.5);
        miPelicula.evalua(10);
        miPelicula.evalua(8.3);

        miPelicula.muestraFichaTecnica();
        System.out.println(miPelicula.getCantidadDeEvaluaciones());
        System.out.println("Evaluacion: " + miPelicula.calculaMedia());

        String separador = "***********";
        System.out.println(separador);

        Serie casaDragon = new Serie("La casa del dragón", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(50);

        casaDragon.muestraFichaTecnica();

        System.out.println(separador);

        Pelicula matrix = new Pelicula("Matrix", 1998);
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

        var peliculaDeAra = new Pelicula("El señor de los anillos", 2001);
        peliculaDeAra.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeAra);
        listaDePeliculas.add(matrix);
        listaDePeliculas.add(miPelicula);
        System.out.println("Tamaño de mi array: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas);

        System.out.println(separador);

        System.out.println(listaDePeliculas.get(0).toString());

    }
}
