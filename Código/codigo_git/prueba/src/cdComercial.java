public class cdComercial {
    String nombre;
    String idioma;

    public cdComercial(String nombre, String idioma) {
        this.nombre = nombre;
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "El nombre del comercial es " + nombre + "\ny su idioma es " + idioma;
    }
}
