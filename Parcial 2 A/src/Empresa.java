import java.util.ArrayList;

public class Empresa {

    String cuit;
    String razonSocial;
    ArrayList<Empleado> empleados = new ArrayList<>();
    Empleado mejorEmpleado = new Empleado("X" , 0 , 1, new NivelAcademico(0, "cero", 0));


    //metodos

    public boolean existeLegajo(int legajo)
    {
        for (Empleado empleado : empleados)
        {
            if (legajo == empleado.legajo)
            {
                return true;
            }
        }
        return false;
    }

    public void ticket(){
        double promedioSalarios = 0;
        System.out.println("Empresa:" + razonSocial);
        System.out.println("CUIT: " + cuit);
        System.out.println("------------------------Empleados------------------------------");
        for (Empleado empleado : empleados)
        {
            System.out.println("Nombre completo: " + empleado.nombreCompleto);
            System.out.println("Salario: $" + empleado.salarioTotalCalculado());
            System.out.println("Nivel educativo: " + empleado.nivelAcademico.nivel + ". Pocentaje de aumento: " + empleado.nivelAcademico.porcentajeAumento + "%");
            System.out.println("---------------------------------------------------------------------");
            promedioSalarios += empleado.salarioTotalCalculado();
        }

        promedioSalarios = promedioSalarios / empleados.size();
        System.out.println("Resumen: \nEl promedio de los salarios de la empresa es: $" + promedioSalarios);

        for (Empleado empleado : empleados)
        {
            if (empleado.salarioTotalCalculado() > mejorEmpleado.salarioTotalCalculado())
            {
                mejorEmpleado = empleado;
            }
        }
        System.out.println("El empleado con mejor salario es: " + mejorEmpleado.nombreCompleto);
        System.out.println("Salario: $" + mejorEmpleado.salarioTotalCalculado());
        System.out.println("Nivel educativo: " + mejorEmpleado.nivelAcademico.nivel + ". Pocentaje de aumento: " + mejorEmpleado.nivelAcademico.porcentajeAumento + "%");
    }


}
