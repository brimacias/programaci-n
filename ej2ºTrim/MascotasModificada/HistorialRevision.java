package ej2oTrim.Herencia.MascotasModificada;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HistorialRevision {
    private boolean repetida;
    private LocalDate fecha;
    private boolean vacuna;
    private String comentario;

    public HistorialRevision(boolean repetida, LocalDate fecha, boolean vacuna, String comentario) {
        this.repetida = repetida;
        this.fecha = fecha;
        this.vacuna = vacuna;
        this.comentario = comentario;
    }

    public boolean isRepetida(){return repetida;}

    public void setRepetida(boolean repetida) {
        this.repetida = repetida;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "HistorialRevision{" +
                "repetida=" + repetida +
                ", fecha=" + fecha +
                ", vacuna=" + vacuna +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
