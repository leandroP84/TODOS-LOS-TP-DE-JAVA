public class Catedra {
    int codigo;
    String denominacion;
    int horasCatedra;


    public Catedra(int codigo, String denominacion, int horasCatedra) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.horasCatedra = horasCatedra;
    }

    //Get set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getHorasCatedra() {
        return horasCatedra;
    }

    public void setHorasCatedra(int horasCatedra) {
        this.horasCatedra = horasCatedra;
    }
}
