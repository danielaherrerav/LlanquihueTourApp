package model;

public class Guia {

    private String nombre;
    private String idioma;
    private int aniosExperiencia;

    public Guia(String nombre, String idioma, int aniosExperiencia) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Guía: " + nombre + " (" + idioma + ", " + aniosExperiencia + " años exp.)";
    }
}
