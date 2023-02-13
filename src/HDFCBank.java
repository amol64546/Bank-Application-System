import java.util.UUID;

public class HDFCBank implements BankInterface{
    private String name;
    private String password;
    private int balance;
    private String accountNo;

    public HDFCBank(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String depositMoney(int amount) {
        balance += amount;
        return amount+" has been added";
    }

    @Override
    public String withdraw(int amount, String password) {
        if(password.equals(this.password)){
            if(balance<amount){
                return "Insufficient balance";
            }else{
                balance -= amount;
                return amount+" has been debited";
            }
        }else{
            return "Entered Password is incorrect";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return 0;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
