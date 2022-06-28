public class Main {
    public static void main(String[] args) {

        Account John = new Account("John Daniels", "0098473641", "Access Bank");
        John.deposit(7000);
        John.withdraw(570);
        John.checkBalance();
        John.deposit(3000);

    }
}
