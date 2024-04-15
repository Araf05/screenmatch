package io.araf.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificable clasificable) {
        if (clasificable.getClasificacion() >= 4 ) {
            System.out.println("Muy bien evaluado al momento");
        } else if (clasificable.getClasificacion() >= 2) {
            System.out.println("Popular al momento");
        } else {
            System.out.println("Colócalo en tu lista para verlo más tarde");
        }
    }
}
