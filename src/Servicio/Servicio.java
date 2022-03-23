package Servicio;

import Pelicula.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula ingresarpelis() {
        Pelicula p1 = new Pelicula();

        System.out.println("Ingrese el titulo de una pelicula..");
        p1.setTitulo(leer.next());
        System.out.println("Ingrese el director de esa pelicula..");
        p1.setDirector(leer.next());
        System.out.println("Ingrese la duracion de esa pelicula");
        p1.setDuraccion(leer.nextDouble());
        return p1;
    }

    
    
    public void mostrarPelis(ArrayList<Pelicula> pelis) {
        for (Pelicula peliculas : pelis) {
            System.out.println(peliculas.toString());
        }
    }

    public void ordenarMayamen(ArrayList<Pelicula> pelis) {
        Collections.sort(pelis, Comparador.Comparadores.Ordeduracionmayoramenor);
        for (Pelicula peli : pelis) {
            System.out.println(peli.toString());
        }}
     

   public void ordenarMenaMay(ArrayList<Pelicula> pelis) {
        Collections.sort(pelis, Comparador.Comparadores.Ordeduracionmenoramayor);
        for (Pelicula peli : pelis) {
            System.out.println(peli.toString());
        }}
public void OrdenAlfabaticoAz(ArrayList<Pelicula> pelis) {
        Collections.sort(pelis, Comparador.Comparadores.AlfabeticoAz);
        for (Pelicula peli : pelis) {
            System.out.println(peli.toString());
        }}
public void OrdenAlfabeticoZa(ArrayList<Pelicula> pelis) {
        Collections.sort(pelis, Comparador.Comparadores.AlfabeticoZa);
        for (Pelicula peli : pelis) {
            System.out.println(peli.toString());
        }}
public void duranmasdeunahora(ArrayList<Pelicula> pelis){
    for (Pelicula peli : pelis) {
        if (peli.getDuraccion()>= 1) {
            System.out.println(peli);
        }
       
    }
}
}
