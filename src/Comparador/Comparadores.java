package Comparador;

import Pelicula.Pelicula;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> Ordeduracionmayoramenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t1.getDuraccion().compareTo(t.getDuraccion());

        }
    };
    public static Comparator<Pelicula> Ordeduracionmenoramayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDuraccion().compareTo(t1.getDuraccion());

        }
    };
     public static Comparator<Pelicula> AlfabeticoAz = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getTitulo().compareTo(t1.getTitulo());

        }
    };
      public static Comparator<Pelicula> AlfabeticoZa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t1.getTitulo().compareTo(t.getTitulo());

        }
    };
}
