package Models;

import java.util.ArrayList;

/**
 * Clase que define una fruta
 * @author Ariel De avila
 */
public class Fruit {
    //Campos
    /**
     * Campo que define el nombre de la fruta
     */
    public String name;
    private float averageWeight;
    /**
     * Lista de los colores que posee la fruta
     */
    public ArrayList<String> colors;

    /**
     *Meteodo que agrega colores a la fruta
     * @param name nombre del color a agregar
     */
    public void setColors(String name) {
        this.colors.add(name);
    }
    /**
     * Metodo que obtiene los colores que posee la fruta
     * @return Lista de String de los colores de la fruta
     */
    public ArrayList<String> getColors() {
        return this.colors;
    }
}
