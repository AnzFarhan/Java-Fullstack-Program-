public class BankAccount {
    public static int totalAccounts = 0;
    public String accountHolder;
    public double balance;

    public BankAccount(String accountHolder, double balance) { //construstor
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        double newBalance = this.balance + amount; //local variable
        this.balance = newBalance;
        System.out.println("New balance: " + this.balance +  "Deposit amount: " + amount);
    }

    public void withdraw(double amount) {
        double newBalance = balance - amount; //local variable
        if (newBalance < 0) {
            System.out.println("Error: Withdrawal amount exceeds current balance ");
        } else {
            this.balance = newBalance;
            System.out.println("New balance: " + balance + "Withdraw amount: " + amount);
        }
    }

         // use this method for display details of accounts
       public void getAccountInfo() { //guna void je sbb dah guna method this.object
            System.out.println("Account Holder: " + this.accountHolder);
            System.out.println("Balance: " + this.balance);
        }

        //method for display details of total accounts
        public static void getTotalAccounts() { //guna static void sebab nk call back totalAccounts kat constructor
            System.out.println("Total Accounts: " + totalAccounts);
        }

    }

