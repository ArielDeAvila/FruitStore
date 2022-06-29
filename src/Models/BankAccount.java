package Models;

/**
 * Esta clase define una cuenta bancaria en la que se definen: el
 * numero de la cuenta y su estado.
 * @author Ariel De avila
 */
public class BankAccount {
    //Campos
    private int accountNumber;
    protected boolean activated=false;

    /**
     * Metodo que establece el numero de la cuenta.
     * @param accountNumber Numero de la cuenta.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *Metodo para obtener el numero de la cuenta bancaría si existe. En caso
     * de no existir retorna 0
     * @return Numero de la cuenta.
     */
    public int getAccountNumber() {
        if(!this.activated){
            System.out.println("Client don't have bank account");
            return 0;
        }else{
            return this.accountNumber;
        }

    }

    /**
     *Metodo que establece el estado de la cuenta
     * @param activated estado de la cuenta
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Metodo que obtiene el estado de la cuenta
     * @return estado de la cuenta
     */
    public boolean getActivated(){
        return this.activated;
    }
}
