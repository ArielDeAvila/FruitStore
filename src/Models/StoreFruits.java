package Models;

import java.util.ArrayList;

public class StoreFruits {
    private ArrayList<Fruit> fruits;
    private ArrayList<Client> clients;

    public void setFruits(Fruit fruit) {
        this.fruits.add(fruit);
    }

    public ArrayList<Fruit> getFruits() {
        return this.fruits;
    }

    public void setClients(Client client) {
        this.clients.add(client);
    }

    public ArrayList<Client> getClients() {
        return this.clients;
    }
}
