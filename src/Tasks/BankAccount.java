package Tasks;

public class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // внесение средств на счет
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + "  Номер счета " + getAccountNumber());
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // снятие средств со счета
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + "  Номер счета " + getAccountNumber());
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }


    // Тестирование класса
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 1000.0);
        System.out.println(account);

        account.deposit(500.0);
        System.out.println(account);

        account.withdraw(200.0);
        System.out.println(account);

        account.withdraw(2000.0); // Недостаточно средств
    }
}

