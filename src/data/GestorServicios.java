package data;

import model.Guia;
import model.PaseoLacustre;
import model.ExcursionCultural;
import model.RutaGastronomica;


public class GestorServicios {
public static void mostrarServicios() {

    // Crear guías (composición)
    Guia guia1 = new Guia("Carlos Muñoz", "Español", 5);
    Guia guia2 = new Guia("Ana Pérez", "Inglés", 8);
    Guia guia3 = new Guia("Luis Torres", "Español", 3);

    // Dos objetos RutaGastronomica
    RutaGastronomica ruta1 = new RutaGastronomica("Ruta del Salmón", 3, guia1, 5);
    RutaGastronomica ruta2 = new RutaGastronomica("Ruta Gastronómica Sur", 4, guia2, 8);

    // Dos objetos PaseoLacustre
    PaseoLacustre paseo1 = new PaseoLacustre("Paseo Lago Llanquihue", 2, guia2, "Catamarán");
    PaseoLacustre paseo2 = new PaseoLacustre("Paseo Lago Todos Los Santos", 3, guia3, "Lancha");

    // Dos objetos ExcursionCultural
    ExcursionCultural excursion1 = new ExcursionCultural("Tour Frutillar", 4, guia1, "Teatro del Lago");
    ExcursionCultural excursion2 = new ExcursionCultural("Tour Puerto Varas", 5, guia3, "Iglesia del Sagrado Corazón");


    System.out.println("=== RUTAS GASTRONÓMICAS ===");
    System.out.println(ruta1);
    System.out.println(ruta2);

    System.out.println("\n=== PASEOS LACUSTRES ===");
    System.out.println(paseo1);
    System.out.println(paseo2);

    System.out.println("\n=== EXCURSIONES CULTURALES ===");
    System.out.println(excursion1);
    System.out.println(excursion2);
}
}