import java.util.ArrayList;
import java.util.Scanner;

class Main {
    static ArrayList<String> historyc = new ArrayList<String>();
    static ArrayList<Integer> historyv = new ArrayList<Integer>();
    static double total = 0.0;

    public static void transactionhistory() {
        if (total > 0) {
            System.out.println("Transaction History:");
            for (int i = 0; i < historyc.size(); i++) {
                System.out.print((i + 1) + "-" + historyc.get(i) + " ");
            }
            System.out.println();
            for (int i = 0; i < historyv.size(); i++) {
                System.out.print("  " + historyv.get(i) + "  ");
            }
            System.out.println();
            System.out.println();
            System.out.println("Total Amount: " + total);
            System.out.println();
        } else {
            System.out.println("Your account balance is " + total + " Rs\n");
        }
    }

    public static void withdrawmoney() {
        Scanner sc = new Scanner(System.in);
        int withdraw;
        System.out.print("Enter money to withdraw: ");
        withdraw = sc.nextInt();
        System.out.println();
        if (total > withdraw) {
            total -= withdraw;
            historyc.add("debit");
            historyv.add(withdraw);
            System.out.println("You have successfully debited.. " + withdraw + " Rs\n");
        } else {
            System.out.println("you have not enough balance..\n");
        }
    }

    public static void depositmoney() {
        Scanner sc = new Scanner(System.in);
        int deposit;
        System.out.print("Enter money to deposit: ");
        deposit = sc.nextInt();
        System.out.println();
        total += deposit;
        historyc.add("credit");
        historyv.add(deposit);
        System.out.println("You have succesfully credited " + deposit + " Rs\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("To check transaction history press 1: ");
            System.out.println("to withdraw money press 2: ");
            System.out.println("To deposit money press 3: ");
            System.out.println("To transfer money press 4: ");
            System.out.println("To exit press 5: ");
            System.out.println();
            System.out.print("enter choice: ");
            ch = sc.nextInt();
            System.out.println();
            switch (ch) {
                case 1:
                    transactionhistory();
                    break;
                case 2:
                    withdrawmoney();
                    break;
                case 3:
                    depositmoney();
                    break;
                case 4:
                    System.out.println("This process is not available now....\n");
            }
        } while (ch != 5);
        sc.close();
    }
}