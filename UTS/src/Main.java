public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(060504, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(113333, 500);
        Customer customer1 = new Customer("Fadhlan");
        Customer customer2 = new Customer("Fadilah");

        customer1.addAccount(savingsAccount);
        customer2.addAccount(currentAccount);

        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);
        savingsAccount.withdraw(1000); 

        currentAccount.deposit(500);
        currentAccount.withdraw(100);
        currentAccount.withdraw(1000); 

        customer1.displayAccounts();
        customer2.displayAccounts();
    }
}