package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("La misma fuerza");
        miCancion.setCantante("Los Aldeanos");
        miCancion.setAlbum("A moler chatarra");
        miCancion.setGenero("Rap");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Casa Verde");
        miPodcast.setTitulo("El Muro");
        miPodcast.setDescripcion("Auto conocimiento");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 200; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("El total de me gusta de mi cancion es: " + miCancion.getTotalDeMeGusta());
        System.out.println("El total de reproducciones de mi cancion es: " + miCancion.getTotalDeReproducciones());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);

    }
}
