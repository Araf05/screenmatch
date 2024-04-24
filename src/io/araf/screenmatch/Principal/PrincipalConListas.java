package io.araf.screenmatch.Principal;

import io.araf.screenmatch.modelos.Pelicula;
import io.araf.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2022);
        Pelicula matrix = new Pelicula("Matrix", 1998);
        var peliculaDeAra = new Pelicula("El señor de los anillos", 2001);

        Serie casaDragon = new Serie("La casa del dragón", 2022);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeAra);
        listaDePeliculas.add(matrix);
        listaDePeliculas.add(miPelicula);
        System.out.println("Tamaño de mi array: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());
    }
}
