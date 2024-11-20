class Funciones {
    int numerador;
    int denominador;

    public Funciones(int numerador, int denominador)
    {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //public Funciones sumarFracciones(Funciones f) {
     //   int nuevoNumerador = this.numerador * f.denominador + f.numerador * this.denominador;
       // int nuevoDenominador = this.denominador * f.denominador;
        // new Fraccion(nuevoNumerador, nuevoDenominador);
    //}

    public Funciones restarFracciones(Funciones f) {
        int nuevoNumerador = this.numerador * f.denominador - f.numerador * this.denominador;
        int nuevoDenominador = this.denominador * f.denominador;
        return new Funciones(nuevoNumerador, nuevoDenominador);
    }

    public Funciones multiplicarFracciones(Funciones f) {
        int nuevoNumerador = this.numerador * f.numerador;
        int nuevoDenominador = this.denominador * f.denominador;
        return new Funciones(nuevoNumerador, nuevoDenominador);
    }

    public Funciones dividirFracciones(Funciones f) {
        int nuevoNumerador = this.numerador * f.denominador;
        int nuevoDenominador = this.denominador * f.numerador;
        return new Funciones(nuevoNumerador, nuevoDenominador);
    }

    public void mostrar() {
        System.out.println(numerador + "/" + denominador);
    }
}