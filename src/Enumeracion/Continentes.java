
package Enumeracion;

/**
 *
 * @author Martín
 * 
 */

public enum Continentes {
    //definiendo atributos a los continentes
    ASIA(44),
    AMERICA(34),
    AFRICA(53),
    EUROPA(46),
    OCEANIA(14);
    private final int cantidad;

    Continentes(int numero) {
        this.cantidad = numero;
    }

    public int cantidadPais() {
        return cantidad;
    }
   
}
