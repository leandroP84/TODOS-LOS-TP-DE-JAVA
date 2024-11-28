import java.util.ArrayList;

public class Universidad {
    String cuit;
    String razonSocial;
    double valorHoraCatedraBase;
    ArrayList<Docente> docentes;


    //METODOS

    //inicializar lista docentes
    public void inicializarListaDocentes() {
        docentes = new ArrayList<>();
    }

    public void agregarDocente(Docente docente) {
        docentes.add(docente);
    }

    //comprobar si el docente ya existe
    public boolean existeDocente(int legajo) {
        for (Docente docente : docentes) {
            if (docente.getLegajo() == legajo) {
                return true;
            }
        }
        return false;
    }

    public double salarioDocenteCalculado(Docente docente){
        double total = 0;
        double totalHoras = 0;
        totalHoras = (valorHoraCatedraBase * docente.getHorasCatedra());
        total = totalHoras + ((totalHoras * docente.getAntiguedad()) / 100);
        return total;
    }

    public void ticket(){
        System.out.println("Universidad: " + razonSocial);
        System.out.println("CUIT: " + cuit + "   Valor Base Hora Cátedra: " + valorHoraCatedraBase);
        System.out.println("------------------------Docentes------------------------------");
        for (Docente docente : docentes) {
            System.out.println("Nombre Completo: " + docente.getNombreCompleto());
            System.out.println("Cátedra: " + docente.catedra.denominacion);
            System.out.println("Salario: " + salarioDocenteCalculado(docente));
            System.out.println("--------------------------------------------------------------");
        }
    }




    //getSet

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public double getValorHoraCatedraBase() {
        return valorHoraCatedraBase;
    }

    public void setValorHoraCatedraBase(double valorHoraCatedraBase) {
        this.valorHoraCatedraBase = valorHoraCatedraBase;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

}
