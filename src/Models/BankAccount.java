package Models;

public class BankAccount {
    private int accountNumber;
    protected boolean activated = false;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    public boolean getActivated(){
        return this.activated;
    }
}
