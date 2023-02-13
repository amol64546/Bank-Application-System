public interface BankInterface {
    public int getBalance();
    public String depositMoney(int amount);
    public String withdraw(int amount, String password);
    public double calculateInterest(int time);
}
