import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance;
        System.out.println("Enter initial balance: ");
        initialBalance = scanner.nextDouble();

        ATM atm = new ATM(initialBalance);

        double depositAmount;
        System.out.println("Enter deposit amount: ");
        depositAmount = scanner.nextDouble();
        atm.deposit(depositAmount);

        double withdrawAmount;
        System.out.println("Enter withdrawal amount: ");
        withdrawAmount = scanner.nextDouble();
        atm.withdraw(withdrawAmount);

        System.out.println("Final balance: " + atm.getBalance());
    }
}

class ATM {
    double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("New balance after deposit: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Corrected this line to subtract the withdrawal amount
            System.out.println("New balance after withdrawal: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}
