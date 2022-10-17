public class cdProgramador {
    String nombre;
    String lenguaje;

    public cdProgramador(String nombre, String lenguaje) {
        this.nombre = nombre;
        this.lenguaje = lenguaje;
    }
    @Override
    public String toString() {
        return "El programador se llama " + nombre + "\nY el lenguaje es " + lenguaje;
    }
}
