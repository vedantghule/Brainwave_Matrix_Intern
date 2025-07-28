package InternshipTasks;

import java.util.Scanner;

class ATM {

    float Balance;
    int PIN = 9970;

    public void checkpin() throws InterruptedException {
        System.out.print("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();

        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin.!");
            checkpin();
        }
    }

    public void menu() throws InterruptedException {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/c Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT !");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1) {
            checkBalance();
        }
        else if (opt == 2){
            withdrawMoney();
        }
        else if(opt == 3) {
            depositMoney();
        }
        else if (opt == 4) {

            System.out.print("Exiting");
            Thread.sleep(500);
            int i = 5;
            while (i!=0){
                System.out.print(".");
                Thread.sleep(500);
                i--;
            }
            System.out.println(".");
            System.out.println("-----------Thank You-----------");

        }

        else {
            System.out.println("Enter a Valid choice..!");
            try {
                menu(); // Added call to menu() to re-prompt the user
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void checkBalance() throws InterruptedException {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdrawMoney() throws InterruptedException {
        System.out.print("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > Balance){
            System.out.println("Insufficient Balance !");
        }
        else {
            Balance = Balance - amount;
            System.out.println("Money Withdrwal Successful..");
        }
        menu();
    }

    public void depositMoney() throws InterruptedException {
        System.out.print("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully..");
        menu();
    }
}

public class BankingATM {
    public static void main(String[] args) throws InterruptedException {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
