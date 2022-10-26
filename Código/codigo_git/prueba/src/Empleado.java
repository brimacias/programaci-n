package programacion;

public class Empleado {
    private String nombre;
    private float sueldo;
    private float descuento;
    private byte numHoras;
    private float precioHora;
    private String mes;
    private int porcentaje;

    private float diferencia;
    public Empleado(String nombre, float sueldo, byte numHorasExtras, String mes) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.numHoras = numHoras;
        this.mes = mes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = 21;
    }

    public byte getNumHorasExtras() {
        return numHoras;
    }

    public void setNumHoras(byte numHoras) {
        this.numHoras = numHoras;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public float getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(float diferencia) {
        this.diferencia = sueldo-descuento;
    }
}
