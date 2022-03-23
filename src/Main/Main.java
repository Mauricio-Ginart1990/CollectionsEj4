/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Pelicula.Pelicula;
import Servicio.Servicio;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author familia ginart
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Servicio S1 = new Servicio();
        ArrayList<Pelicula> pelis = new ArrayList();
        Scanner leer = new Scanner(System.in);
       String res = "";
        
         do {

            pelis.add(S1.ingresarpelis());
       
            System.out.println("Desea ingresar otra Pelicula??");
            res = leer.next();
        } while (res.equalsIgnoreCase("si"));
         System.out.println("====================");
        System.out.println("La Peliculas Ingresadas son : ");
         S1.mostrarPelis(pelis);
         System.out.println("====================");
        System.out.println("Las peliculas con una duracion mayor a una hora son :");
        S1.duranmasdeunahora(pelis);
        System.out.println("====================");
        System.out.println("Las ordenamos sugun su duracion de mayor a menor");
        S1.ordenarMayamen(pelis);
        System.out.println("====================");
        System.out.println("Las ordenamos segun su duracion de menor a mayor");
        S1.ordenarMenaMay(pelis);
        System.out.println("====================");
        System.out.println("Las ordenamos en orden Alfabetico de la A-Z");
        S1.OrdenAlfabaticoAz(pelis);
        System.out.println("====================");
        System.out.println("Las ordenamos en orden Alfabetico de la Z-A");
        S1.OrdenAlfabeticoZa(pelis);
        }
    }
    

//  do {
//
//            listaPeli.add(serv.cargaPeliculas());
//            
//            System.out.println("Desea ingresar otra Pelicula??");
//            rta = leer.next();
//        } while (rta.equalsIgnoreCase("si"));