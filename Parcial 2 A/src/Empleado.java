public class Empleado {

    String nombreCompleto;
    int legajo;
    double salario;
    NivelAcademico nivelAcademico;

    public Empleado() {
    }

    public Empleado(String nombreCompleto, int legajo, double salario) {}

    public Empleado(String nombreCompleto, int legajo, double salario, NivelAcademico nivelAcademico) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.salario = salario;
        this.nivelAcademico = nivelAcademico;
    }

    //metodos

    public double salarioTotalCalculado(){
        double aumento = (salario * nivelAcademico.porcentajeAumento) / 100;
        return salario + aumento;
    }

}
