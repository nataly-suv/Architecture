package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

private int balance;
private long card;


    public BankAccount() {
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }

    public int getBalance() {
        return balance;
    }

    public long getCard() {
        return card;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    
}
