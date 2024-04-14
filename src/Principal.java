import io.araf.screenmatch.modelos.Pelicula;

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
    }
}
