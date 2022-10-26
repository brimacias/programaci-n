package programacion;

public class principalEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Agus",(float) 1600.5, (byte) 12,"octubre");

        System.out.println("Mes: " + e1.getMes());
        System.out.println("Nombre del empleado: "  + e1.getNombre());
        System.out.println("Sueldo Base: " + e1.getSueldo());
        System.out.println("Porcentaje de descuento: " + e1.getDescuento());
        System.out.println("HorasExtra: " + (e1.getNumHorasExtras()*e1.getPrecioHora()));
        System.out.println("Descuentos: " + (e1.getPorcentaje()*(e1.getSueldo() + e1.getNumHorasExtras())/100));
        System.out.println("Diferencia: " + (e1.getDiferencia()));
        System.out.println("Sueldo neto: " + (e1.getDiferencia()+e1.getNumHorasExtras()));
    }
}
