package Account;

public class Bank {
    // Static variable for the bank name
    static String bankName;
    // Instance variable for the balance
    static double balance;

    // Constructor that initializes balance and sets name to a default
    public Bank(double initialBalance) {
        this.balance = initialBalance; // Set the instance variable balance
        bankName = "Default Name"; // Set the static variable bankName
    }

    // Get bank name
    public static String getBankName() {
        return bankName;
    }

    // Get bank balance
    public double getBankBalance() { // Change to instance method
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Add the amount to the balance
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
}
