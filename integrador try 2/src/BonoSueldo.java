public class BonoSueldo { //representa un recibo de sueldo especifico
    private Empleado empleado;  // Empleado al que pertenece el bono
    private int mesLiquidacion;
    private int anioLiquidacion;
    private double montoLiquidacion;
    private String [][] bonoCalculado; //Matriz con el detalle del cálculo

    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public int getMesLiquidacion() {
        return mesLiquidacion;
    }
    public void setMesLiquidacion(int mesLiquidacion) {
        this.mesLiquidacion = mesLiquidacion;
    }
    public int getAnioLiquidacion() {
        return anioLiquidacion;
    }
    public void setAnioLiquidacion(int anioLiquidacion) {
        this.anioLiquidacion = anioLiquidacion;
    }
    public double getMontoLiquidacion() {
        return montoLiquidacion;
    }
    public String[][] getBonoCalculado() { return bonoCalculado; }
    public void setBonoCalculado(String[][] bonoCalculado) { this.bonoCalculado = bonoCalculado; }
}
