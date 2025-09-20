//import Account.Bank;
//
//public class Main {
//    public static void main(String[] args) {
//        // Create an instance of Bank with an initial balance
//        Bank myBankAccount = new Bank(1000.0);
//
//        // Print the bank name
//        System.out.println("Bank Name: " + Bank.getBankName());
//
//        // Print the balance
//        System.out.println("Initial Balance: " + myBankAccount.getBankBalance());
//
//        // Deposit money
//        myBankAccount.deposit(500);
//        System.out.println("Balance after deposit: " + myBankAccount.getBankBalance());
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int resultSubtract = BasicMath.subtract(10, 5);
//        System.out.println("Subtraction Result: " + resultSubtract);
//
//        double resultDivide1 = BasicMath.divide(10.0, 2.0);
//        System.out.println("Division Result: " + resultDivide1);
//
//        double resultDivide2 = BasicMath.divide(10.0, 0.0);
//        System.out.println("Division Result (by zero): " + resultDivide2);
//
//    }
//}
public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        System.out.println("Total Books after adding 1: " + myLibrary.addBook());
        System.out.println("Total Books after adding 2: " + myLibrary.addBook());
        System.out.println("Total Books after adding 3: " + myLibrary.addBook());
    }
}
