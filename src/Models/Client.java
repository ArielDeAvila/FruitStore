package Models;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que define a un cliente en la que se genera una cuenta bancaría
 * y las propiedades de una persona.
 * @author Ariel De avila
 */
public class Client extends Person{
    //Campos
    private BankAccount clientBankAccount= new BankAccount();
    private ArrayList<Order> orders;

    /**
     * Contructor en la que define las propiedades de una persona pasandolas
     * por parametros
     * @param name Nombre del cliente
     * @param lastName1 Primer apellido del cliente
     * @param lastName2 Segundo apellido del cliente
     * @param dateBirth Fecha de nacimiento del cliente
     */
    public Client(String name, String lastName1, String lastName2, Date dateBirth) {
        super(name, lastName1, lastName2, dateBirth);
    }

    /**
     * Metodo que establece el numero de cuenta bancaria
     * @param accountNumber numero de la cuenta bancaria
     */
    public void setAccountNumber(int accountNumber) {
        this.clientBankAccount.setAccountNumber(accountNumber);
    }

    /**
     * Metodo que obtiene el numero de la cuenta bancaria
     * @return numero de la bancaria
     */
    public int getAccountNumber(){
        return this.clientBankAccount.getAccountNumber();
    }

    /**
     * Metodo que establece el estado de la cuenta
     * @param activation estado de la cuenta
     */
    public void setActivatedAccount(boolean activation){
        this.clientBankAccount.setActivated(activation);
    }

    /**
     * Metodo que agrega un nuevo pedido al cliente
     * @param order Pedido a agregar
     */
    public void addOrder(Order order){
        this.orders.add(order);
    }

    /**
     * Metodo que regresa una lista con los pedidos del cliente
     * @return Lista de pedidos
     */
    public ArrayList<Order> orders(){
        return this.orders;
    }

}
