public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000);
        amount atm = new amount(userAccount);
        atm.start();
    }
}