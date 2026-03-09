package Assignment1;

class BankAccount {

    private int accountNumber;
    private double balance;

    void setDetails(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void display() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setDetails(101, 5000);
        obj.deposit(1000);
        obj.withdraw(500);
        obj.display();
    }
}