package io.araf.screenmatch.Principal;

import io.araf.screenmatch.modelos.Pelicula;
import io.araf.screenmatch.modelos.Serie;
import io.araf.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2022);
        Pelicula matrix = new Pelicula("Matrix", 1998);
        var peliculaDeAra = new Pelicula("El señor de los anillos", 2001);

        Serie casaDragon = new Serie("La casa del dragón", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeAra);
        peliculaDeAra.evalua(10);
        lista.add(matrix);
        matrix.evalua(6);
        lista.add(miPelicula);
        miPelicula.evalua(4);
        lista.add(casaDragon);

        for(Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println("Puntuacion: " + pelicula.getClasificacion() );
            }
        }

        /*
        lista.forEach(System.out::println);*/

        List<String> listaDeArtistas = new LinkedList<>(); /* Utilizar una interfaz como List, instanciando una Lista enlazada, un arrayList, o lo que necesitemos*/
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenada: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        /*
        sort pertenece a ArrayList
        Comparator es una interfaz, estamos llamando directamente a la interfaz
        comparing es un metodo estatico
        Y le pasamos como parametro la fecha de lanzamiento de cada titulo para que los compare
         */

        System.out.println("Lista ordenada por fecha: " + lista);
    }
}
