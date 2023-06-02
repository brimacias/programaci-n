package ej2oTrim.Herencia.MascotasModificada;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

            Animales gato = new Gato("Kika", 5, "Vivita y coleando", "01-02-2018", "Negro", false);
            Inventario.animales.add(gato);
            Animales perro = new Perro("Luna", 4, "Viva", "01-01-2019", "Mezcla de razas", false);
        Inventario.animales.add(perro);
            Animales perro2 = new Perro("Lolo", 14, "Vico", "12-08-2009", "Mezcla de razas", false);
        Inventario.animales.add(perro2);
            Animales canario = new Canario("Bailey", 2, "Vivo", "12-05-2020", "pico", true, "Amarillo", false);
        Inventario.animales.add(canario);
            Animales loro = new Loro("Iago", 3, "Vivo", "01-03-2020", "pico", true, "India", true);
        Inventario.animales.add(loro);
            //menu();

            HistorialRevision h = new HistorialRevision(true, LocalDate.of(2023,6,2),true,"._.");
            HistorialRevision h2 = new HistorialRevision(false,LocalDate.of(2022,10,23),true,":v");
            ((Perro)perro).setHistorial(h2);
            for (int i = 0; i < Inventario.animales.size();i++) {
                if (Inventario.animales.get(i) instanceof  Perro) {
                    ((Perro)Inventario.animales.get(i)).setHistorial(h);
                    ((Perro)Inventario.animales.get(i)).setHistorial(h2);
                    ((Perro)Inventario.animales.get(i)).getHistorial();
                }
            }


            ArrayList<HistorialRevision> historial = ((Perro)perro2).getHistorial();
            Inventario.mostrarListaRevisionesPerros();
            //Inventario.menuII();
    }
}
