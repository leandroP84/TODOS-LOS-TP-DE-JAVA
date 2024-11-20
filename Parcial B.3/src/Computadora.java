public class Computadora {
    private String marca;
    private String modelo;
    private long codigoBarras;
    private double precioTotal;
    private double porcentajeAumento;
    private double montoFinal;
    private String [][] componentes;



    //inicializar componentes
    public void inicializarComponentes(int cantidadComponentes)
    {
        this.componentes = new String[cantidadComponentes][4];
    }

    //metodo para agregar componentes:
    public void agregarComponentes(int posicion, String codigo, String denominación, String precio, String obligatorio)
    {
        this.componentes[posicion][0] = codigo;
        this.componentes[posicion][1] = denominación;
        this.componentes[posicion][2] = precio;
        this.componentes[posicion][3] = obligatorio;
    }

    //metodo para verificar si un componente ya existe:
    public boolean existeComponente(String codigo)
    {
        for (String[] componente : componentes)
        {
            if (componente[0] != null && componente[0].equals(codigo))
            {
                return true;
            }
        }
        return false;
    }

    //metodo para sumar los precios:
    public double sumarPrecios()
    {
        double total = 0;

        for (String[] precio : componentes)
        {
            total = total + Double.parseDouble(precio[2]);
        }

        return total;
    }

    //metodo mostrar el ticket
    public void mostrarTicket(double total, double recargo, double totalComponentes)
    {
        System.out.println("La computadora especificada es: \n" +
                "Marca: " + this.getMarca()
                + "\nModelo: " + this.getModelo()
                + "\nCodigo de barras: " + this.getCodigoBarras()
                + "\nAño: 2024"
        );
        System.out.println("Codigo:       Denominación:       Precio:");
        for (String[] comp : componentes)
        {
            System.out.println("   "+comp[0] + "         " + comp[1] +"       "+ comp[2]);
        }
        System.out.println("              Total componentes:  " + totalComponentes);
        System.out.println("              Recargo:            " + recargo);
        System.out.println("              Total:              " + total);

    }

    //metodo para mostrar la matriz
    public void getComponentes()
    {
        for (String[] componente : componentes)
        {
            System.out.println(componente[0] + ", " + componente[1] +", "+ componente[2] +", "+ componente[3]);
        }
    }







    //constructor
    public Computadora() {} //constructor sin parametros (solo crea un objeto, no le asigna nigun atributo)

    public Computadora(String marca) {
        this.marca = marca;
    }

    public Computadora(String marca, String modelo, long codigoBarras, double precioTotal, double porcentajeAumento, double montoFinal) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigoBarras = codigoBarras;
        this.precioTotal = precioTotal;
        this.porcentajeAumento = porcentajeAumento;
        this.montoFinal = montoFinal;
    }

    //GET Y SET
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public void setPorcentajeAumento(double porcentajeAumento) {
        this.porcentajeAumento = porcentajeAumento;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

}
