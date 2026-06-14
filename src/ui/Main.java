package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String ruta = "resources/tours.txt";
        ArrayList<Tour> tours = GestorDatos.leerTours(ruta);

        System.out.println("**** TODOS LOS TOURS ****");
        for (Tour t : tours) {
            System.out.println(t);
        }
        System.out.println("\n**** TOURS GASTRONÓMICOS ****"); // filtro tipo de tour (gastronomico)
        for (Tour t : tours) {
            if (t.getTipo().equals("gastronómico")){
                System.out.println(t);

            }
        }

        System.out.println("\n**** TOURS CON PRECIOS MENORES A $40.000 ****");
        for (Tour t : tours) {
            if (t.getPrecio() < 40000) {
                System.out.println(t);
            }
        }
    }
}







