public class camion {
    String propietario;
    String matricula;
    double litros;
    double cuentaAntes;
    double cuentaDespues;
    String nombreCompania;

    public camion(String propietario, String matricula, double litros, double cuentaAntes, double cuentaDespues, String nombreCompania) {
        this.propietario = propietario;
        this.matricula = matricula;
        this.litros = litros;
        this.cuentaAntes = cuentaAntes;
        this.cuentaDespues = cuentaDespues;
        this.nombreCompania = nombreCompania;
    }

    public double consumoTotal(double lit100km, double kmRecorridos) {
        double total = lit100km / kmRecorridos;
        return total;
    }

    @Override
    public String toString() {
        return "Propietario: " + propietario + "\nMatrícula: " + matricula + "\nLitros: " + litros +
                "\nEstado del cuentakilómetros antes del viaje: " + cuentaAntes +
                "\nEstado del cuentakilómetros después del viaje: " + cuentaDespues +
                "\nNombre de la compañía: " + nombreCompania +
                "\nConsumo total: " + consumoTotal(450,2008);
    }
}
