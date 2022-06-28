public class Account {
    private String name;
    private String accountNo;
    private String bankName;
    private int balance;

    public Account(String name, String accountNo, String bankName) {
        this.name = name;
        this.accountNo = accountNo;
        this.bankName = bankName;
        this.balance = 0;
    }

    public void deposit(int depositAmount){
        balance+=depositAmount;
        System.out.println("****************************\n\n TRANSACTION SUCCESSFUL \n\n****************************\n\n DEPOSIT AMOUNT: $" + depositAmount + "\n\nBALANCE: $" + balance);
    }

    public void withdraw(int withdrawalAmount){
        if(balance-withdrawalAmount<0){
            System.out.println("****************************\n\n TRANSACTION FAILED \n\n****************************\nYOU CANNOT WITHDRAW MORE THAN YOUR BALANCE");
        } else {
            balance -= withdrawalAmount;
            System.out.println("****************************\n\n TRANSACTION SUCCESSFUL \n\n****************************\n\n WITHDRAWAL AMOUNT: $" + withdrawalAmount + "\n\nBALANCE: $" + balance);
        }
    }

    public void checkBalance(){
        System.out.println("****************************\n\n ACCOUNT BALANCE: $" + balance + "\n\n****************************");
    }


}
