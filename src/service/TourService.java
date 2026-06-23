package service;


import model.Tour;
import java.util.ArrayList;

public class TourService {

    //para mostrar todos los tours

public static void mostrarTodos(ArrayList<Tour>lista) {
    System.out.println(" **** TODOS LOS TOURS **** ");
    for (Tour t : lista) {
        System.out.println(t);
    }
}
    // para filtrar por tipo
public static void  filtrarPorTipo(ArrayList<Tour> lista, String tipo) {
    System.out.println("\n **** TOURS TIPO: " + tipo + " **** ");
    boolean encontrado = false;
    for (Tour t : lista) {
        if (t.getTipo().equalsIgnoreCase(tipo)){
            System.out.println(t);
            encontrado = true;
        }
    }
    if (!encontrado) {
        System.out.println("No se encontraron tours del tipo: " + tipo);
    }
}
    // para filtrar por precio maximo

public static void filtrarPorPrecio(ArrayList<Tour> lista, int precioMax){
    System.out.println(" **** TOURS CON PRECIO MENOR A $" + precioMax + " **** ");
    for(Tour t : lista){
        if(t.getPrecio() < precioMax){
            System.out.println(t);
        }
    }
}
    // para buscar por nombre
public static void buscarPorNombre(ArrayList<Tour> lista, String nombre) {
    System.out.println("\n **** BUSCAR: " + nombre + " **** ");
    boolean encontrado = false;
    for (Tour t : lista){
        if (t.getNombre().toLowerCase().contains(nombre.toLowerCase())){
            System.out.println(t);
            encontrado = true;
        }
    }
        if (!encontrado) {
            System.out.println("No se encontraron tours con ese nombre.");
        }
       }
      }
