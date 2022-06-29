package Models;

import java.util.ArrayList;

/**
 * Clase que define las propiedades de una tienda de frutas
 * @author: Ariel De avila
 */
public class StoreFruits {
    //Campos
    private ArrayList<Fruit> fruits;
    private ArrayList<Client> clients;

    /**
     *Metodo que agrega frutas a la lista de la tienda
     * @param fruit Nueva fruta a agregar
     */
    public void setFruits(Fruit fruit) {
        this.fruits.add(fruit);
    }

    /**
     *Metodo que obtiene la lista de frustas que posee la tienda
     * @return Lista de frutas
     */
    public ArrayList<Fruit> getFruits() {
        return this.fruits;
    }

    /**
     * Metodo que agrega clientes nuevos a la tienda
     * @param client Cliente nuevo
     */
    public void addClients(Client client) {
        this.clients.add(client);
    }

    /**
     *Metodo que obtiene una lista de clientes que pertenecen a la tienda
     * @return Lista de clientes
     */
    public ArrayList<Client> getClients() {
        return this.clients;
    }
}
