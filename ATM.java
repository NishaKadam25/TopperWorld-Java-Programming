import java.util.Scanner;

public class ATM 
{
    private double balance;
    private Scanner scanner;

    public ATM() 
    {
        balance = 0;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() 
    {
        System.out.println("ATM Machine");
        System.out.println("Choose 1 for Withdraw");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for Exit");  
    }

    public void withdraw() 
    {
        System.out.print("Enter the amount to withdraw:");
        double amount = scanner.nextDouble();

        if (amount > balance) 
        {
            System.out.println("Insufficient balance");
        } 
        else 
        {
            balance = balance - amount;
            System.out.println("Your Money has been successfully Withdraw");
        }
    }

    public void deposit() 
    {
        System.out.print("Enter the Money to be deposited :");
        double amount = scanner.nextDouble();

        if (amount > 0) 
        {
            balance = balance + amount;
            System.out.println("Your Money has been successfully deposited");
        } 
        else 
        {
            System.out.println("Invalid amount.");
        }
    }

    public void checkBalance()
    {
        System.out.println("Your balance is:" + balance);
    }

    public void run()
    {
        boolean isRunning = true;

        while (isRunning)
        {
            displayMenu();
            System.out.print("Choose the operation :");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using this ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.run();
    }
}