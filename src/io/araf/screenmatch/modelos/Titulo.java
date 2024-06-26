package io.araf.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import io.araf.screenmatch.excepciones.ErrorEnConversionDuracionException;

public class Titulo implements Comparable<Titulo>{
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnPlan;
    private double sumaDeLasEvaluaciones;
    private int cantidadDeEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")) {
            throw new ErrorEnConversionDuracionException("No pude convertir la duración " +
                    "porque contenía un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(
                miTituloOmdb.runtime().substring(0, 3).replace(" ", "")
        );
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public double getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }

    public int getCantidadDeEvaluaciones() {
        return cantidadDeEvaluaciones;
    }

    public void muestraFichaTecnica() {
        String fichaTecnica = """
                Titulo: %s
                Fecha de lanzamiento: %d
                Duración: %dmin""".formatted(nombre, fechaDeLanzamiento, getDuracionEnMinutos());
        System.out.println(fichaTecnica);
    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        cantidadDeEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDeLasEvaluaciones / cantidadDeEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return  " (Nombre: " + nombre +
                ", Lanzamiento: " + fechaDeLanzamiento +
                ", Duración en minutos: " + duracionEnMinutos + "min )";
    }
}
