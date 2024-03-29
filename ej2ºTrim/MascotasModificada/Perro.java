package ej2oTrim.Herencia.MascotasModificada;

import java.util.ArrayList;

public class Perro extends Animales {
    private String raza;
    private boolean pulgas;

    private static ArrayList<HistorialRevision> vacunasArray = new ArrayList<HistorialRevision>();

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + this.getNombre() +
                "\nEdad: " + this.getEdad() + "\nEstado: " + this.getEstado() +
                "\nFecha de nacimiento: " + this.getFechaNacimiento() +
                "\nRaza: " + this.getRaza() + "\nPulgas: " + this.getPulgas());
    }

    @Override
    public void habla() {
        System.out.println("guau guau");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean getPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public ArrayList<HistorialRevision> getHistorial() {
        return vacunasArray;
    }

    public void setHistorial(HistorialRevision historial) {
        vacunasArray.add(historial);
    }
}
