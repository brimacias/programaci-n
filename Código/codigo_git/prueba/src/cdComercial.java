public class cdComercial {
    String nombre;
    String idioma;

    int experiencia;

    public cdComercial(String nombre, String idioma, int experiencia) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "El nombre del comercial es " + nombre + "\ny su idioma es " + idioma + "\nTiene una experiencia de " + experiencia + " años.";
    }
}
