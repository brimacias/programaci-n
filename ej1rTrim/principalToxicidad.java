package ej1rTrim;

import ej1rTrim.Toxicidad;

public class principalToxicidad {
    public static void main(String[] args) {
        Toxicidad t1 = new Toxicidad("Producto toxico",5);
        System.out.println("La toxicidad del producto " + Toxicidad.getNombreProducto()
                + " es " + Toxicidad.getGradoToxicidad() + ".");
    }
}
