package ui;

import data.GestorDatos;
import model.Tour;
import service.TourService; // agregammos paquete service
import java.util.ArrayList;
import java.util.Scanner; // agregamos scanner


public class Main {
    public static void main(String[] args) {

        String ruta = "resources/tours.txt";
        ArrayList<Tour> tours = GestorDatos.leerTours(ruta);

        //agregamos scanner
        Scanner scanner = new Scanner(System.in);

        //empezamos a usar service
        //mostrar todos
        TourService.mostrarTodos(tours);

        //filtrar por tipo, ya usando scanner
        System.out.println("\nIngrese el tipo de tour que desea buscar: ");
        String tipo = scanner.nextLine() .trim();
        TourService.filtrarPorTipo(tours, tipo);

        //filtrar por precio maximo
        System.out.println("\nIngrese precio máximo a buscar: ");
        int precio = scanner.nextInt();
        TourService.filtrarPorPrecio(tours, precio);
        scanner.nextLine();

        //buscar por nombre
        System.out.println("\nIngrese el nombre del tour que desea buscar: ");
        String nombre = scanner.nextLine() .trim();
        TourService.buscarPorNombre(tours, nombre);

        scanner.close();

    }
}








