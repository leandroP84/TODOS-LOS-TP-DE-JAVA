//interfaz

public interface IElectrico {
    public void atacarImpactrueno();
    public void atacarPunioTrueno();
} //son metodos abstractos,pero no hace falta definirlos con (public 'abstract' void)

//contiene metodos abstractos y atributos constantes. (public static final)
//todos sus metodos y atributos son publicos
//solo puede ser hija de otras interfaces
// Indican el "puede hacer" de un objeto.

//al heredar, se llaman sus metodos con @override
