class Account {
    private double balance; 

    public void setBalance(double amount) {
        if (amount > 0)
            balance = amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setBalance(5000);
        System.out.println("Balance: " + a1.getBalance());
    }
}
