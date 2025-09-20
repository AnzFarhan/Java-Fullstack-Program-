public class Main {
    public static void main(String[] args) {

        // Create new BankAccount objects
        BankAccount account1 = new BankAccount("Farhan", 2000);
        account1.getAccountInfo();

        // Deposit and withdraw money from account1
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.withdraw(400.0);  // This should trigger an error message

        // Create another BankAccount object for Jane Smith
        BankAccount account2 = new BankAccount("Fahmi", 3000);
        account2.getAccountInfo();

        // Perform deposit and withdrawal on account2
        account2.deposit(1000.0);
        account2.withdraw(300.0);
        account2.withdraw(200.0);  // Successful withdrawal

        // Create another BankAccount object for Mike Johnson
        BankAccount account3 = new BankAccount("Haikal", 4000);
        account3.getAccountInfo();

        // Perform deposit and withdrawal on account3
        account3.deposit(1500.0);
        account3.withdraw(500.0);
        account3.withdraw(1000.0);  // This should trigger an error message

        // Call the static method to print the total number of accounts created
        BankAccount.getTotalAccounts();  // This prints the total accounts created so far


    }
}