package BankAccount;

public class BankAccount {
    private String AccountNumber;
    private double Balance;

    // Constructor
    public BankAccount(String AccountNumber, double Balance) {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    // Getter
    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    // Setter
    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }
}
