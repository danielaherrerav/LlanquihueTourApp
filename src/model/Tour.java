package model;

public class Tour {

private String nombre;
private String tipo;
private int precio;
private int duracion; // en horas


    public Tour(String nombre, String tipo, int precio, int duracion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.duracion = duracion;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion){
            this.duracion = duracion;
        }

        @Override
        public String toString() {
            return "Tour: " + nombre + " | Tipo: " + tipo + " | Precio: $ " + precio +
                    " | Duración: " + duracion + " hrs";




    }
}

