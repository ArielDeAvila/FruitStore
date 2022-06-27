package Models;

import java.util.Date;

public class Client extends Person{

    private BankAccount clientBankAccount = new BankAccount();

    public Client(String name, String lastName1, String lastName2, Date dateBirth) {
        super(name, lastName1, lastName2, dateBirth);
    }

    public void setAccountNumber(int accountNumber) {
        this.clientBankAccount.setAccountNumber(accountNumber);
    }

    public void setActivatedAccount(boolean activation){
        this.clientBankAccount.setActivated(activation);
    }
}
