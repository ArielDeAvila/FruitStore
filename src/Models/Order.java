package Models;

import java.util.ArrayList;

/**
 * Clase que define un pedido mediante
 * @author Ariel De avila
 */
public class Order {
    //Campos
    private ArrayList<Fruit> fruits;
    private float totalOrder;

    /**
     * Metodo que agrega las frutas a la orden
     * @param fruits Fruta a agregar
     */
    public void addFruits(Fruit fruits) {
        this.fruits.add(fruits);
    }

    /**
     * Metodo que obtiene la lista de frutas que están almacenas en el pedido
     * @return Lista de frutas
     */
    public ArrayList<Fruit> getFruits() {
        return this.fruits;
    }

    /**
     *Metodo que establece el total del pedido
     * @param totalOrder total del peodido
     */
    public void setTotalOrder(float totalOrder) {
        this.totalOrder = totalOrder;
    }

    /**
     * Metodo que obtiene el total del pedido
     * @return total del pedido
     */
    public float getTotalOrder() {
        return totalOrder;
    }
}
