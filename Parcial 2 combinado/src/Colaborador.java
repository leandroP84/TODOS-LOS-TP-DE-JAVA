public class Colaborador {

    private String nombreCompleto;
    private int identificador;
    private double salarioBase;
    private Especialidad especialidad;


    //metodos

    public double salarioTotalCalculado() {
        return salarioBase + salarioBase * (especialidad.getPorcentajeComplemento()/100);
    }


    //getset

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public String getNomEspecialidad() {
        return especialidad.getNombreEspecialidad();
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
