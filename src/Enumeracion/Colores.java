/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeracion;

/**
 *
 * @author Martín
 */
public enum Colores {
    ROJO(1,23,44),
    NEGRO(2,34,552),
    BLANCO(23,45,12),
    VERDE(43,12,52),
    AMARILLO(34,21,552),
    AZUL(778,34,34),
    ROSA(65,73,44);
    
    private final int matiz;
    private final int intensidad;
    private final int luminosidad;

    private Colores(int matriz, int intensidad, int luminosidad) {
        this.matiz = matriz;
        this.intensidad = intensidad;
        this.luminosidad = luminosidad;
    }

    public int getMatiz() {
        return matiz;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public int getLuminosidad() {
        return luminosidad;
    }
    
    
    
}
