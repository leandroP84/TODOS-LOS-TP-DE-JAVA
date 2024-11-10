//practica parcial (clase empleado)

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombreEmpleado;
    private long cuil;
    private int anioIngreso;
    private double montoAntiguedad;
    private double sueldoBasico;
    private List<BonoSueldo> bonos;

    public Empleado() {
        this.bonos = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombreEmpleado() { return nombreEmpleado; }
    public void setNombreEmpleado(String nombreEmpleado) { this.nombreEmpleado = nombreEmpleado; }

    public long getCuil() { return cuil; }
    public void setCuil(long cuil) { this.cuil = cuil; }

    public int getAnioIngreso() { return anioIngreso; }
    public void setAnioIngreso(int anioIngreso) { this.anioIngreso = anioIngreso; }

    public double getMontoAntiguedad() { return montoAntiguedad; }
    public void setMontoAntiguedad(double montoAntiguedad) { this.montoAntiguedad = montoAntiguedad; }

    public double getSueldoBasico() { return sueldoBasico; }
    public void setSueldoBasico(double sueldoBasico) { this.sueldoBasico = sueldoBasico; }

    public List<BonoSueldo> getBonos() { return bonos; }
    public void addBono(BonoSueldo bono) { this.bonos.add(bono); }

    public void calcularAntiguedad() {
        int aniosAntiguedad = LocalDate.now().getYear() - this.anioIngreso;
        this.montoAntiguedad = this.sueldoBasico * (aniosAntiguedad * 0.02);
    }
}
