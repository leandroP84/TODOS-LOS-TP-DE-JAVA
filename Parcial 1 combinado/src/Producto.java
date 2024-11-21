public class Producto {
    private String codigo;
    private String nombre;
    private double precioBase;
    private int cantidadEnStock;
    private String[][] componentes; //matriz para detalles de componenetes


    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public String[][] getComponentes() {
        return componentes;
    }

    public void setComponentes(String[][] componentes) {
        this.componentes = componentes;
    }
}
