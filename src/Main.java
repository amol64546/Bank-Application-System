import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, password and opening balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBIAccount firstAcc = new SBIAccount(name,balance,password);
        System.out.println("Your account has been created: "+firstAcc.getAccountNo());

        // getBalance
        System.out.println("Your current balance is: "+firstAcc.getBalance());

        // deposit
        System.out.println("Enter amount to deposit: ");
        int depositAmount = sc.nextInt();
        System.out.println(firstAcc.depositMoney(depositAmount));
        System.out.println("New balance is: "+firstAcc.getBalance());

        // withdraw
        System.out.println("Enter amount to be withdrawn: ");
        int amount = sc.nextInt();
        System.out.println("Enter password");
        String enteredPassword = sc.next();

        System.out.println(firstAcc.withdraw(amount, enteredPassword));
        System.out.println("Current balance is "+firstAcc.getBalance());

        //interest
        System.out.println("Interest for 4 years on current balance "+firstAcc.getRateOfInterest());
    }
}