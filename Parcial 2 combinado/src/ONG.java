import java.util.ArrayList;

public class ONG {

    private String cuit;
    private String nombreOrganizacion;
    private ArrayList<Colaborador> colaboradores = new ArrayList<>();


    //metodos
    public boolean existeColaborador(int identificador)
    {
        for (Colaborador c : colaboradores)
        {
            if (c.getIdentificador() == identificador)
            {
                return true;
            }
        }
        return false;
    }

    public void addColaboradores(Colaborador c)
    {
        colaboradores.add(c);
    }

    public void ticket() {
        Colaborador mejorColaborador = new Colaborador();
        mejorColaborador.setSalarioBase(0);
        mejorColaborador.setEspecialidad(new Especialidad(00, "x", 0));
        double promedio = 0;
        System.out.println("ONG: " + nombreOrganizacion);
        System.out.println("CUIT: " + cuit);
        System.out.println("Cantidad de colaboradores: " + colaboradores.size());
        System.out.println("---------------------Colaboradores:---------------------");
        for (Colaborador c : colaboradores)
        {
            System.out.println("Nombre: " + c.getNombreCompleto());
            System.out.println("Identificador: " + c.getIdentificador());
            System.out.println("Especialidad: " + c.getNomEspecialidad());
            System.out.println("Salario: $" + c.salarioTotalCalculado());
            promedio = promedio + c.salarioTotalCalculado();
            if (c.salarioTotalCalculado() > mejorColaborador.salarioTotalCalculado())
            {
                mejorColaborador = c;
            }
            System.out.println("-------------------------------------------------------");
        }
        promedio = promedio / colaboradores.size();
        System.out.println("Promedio de salarios: " + promedio);
        System.out.println("Colaboarador con el mejor salario: " + mejorColaborador.getNombreCompleto() + ", $" + mejorColaborador.salarioTotalCalculado());

    }



    //getset
    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getNombreOrganizacion() {
        return nombreOrganizacion;
    }

    public void setNombreOrganizacion(String nombreOrganizacion) {
        this.nombreOrganizacion = nombreOrganizacion;
    }

    public ArrayList<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }
}
