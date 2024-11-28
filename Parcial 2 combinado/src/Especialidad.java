public class Especialidad {
    private int codigo;
    private String nombreEspecialidad;
    private double porcentajeComplemento;

    public Especialidad(int codigo, String nombreEspecialidad, double porcentajeComplemento) {
        this.codigo = codigo;
        this.nombreEspecialidad = nombreEspecialidad;
        this.porcentajeComplemento = porcentajeComplemento;
    }


    //getset

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public double getPorcentajeComplemento() {
        return porcentajeComplemento;
    }

    public void setPorcentajeComplemento(double porcentajeComplemento) {
        this.porcentajeComplemento = porcentajeComplemento;
    }
}
