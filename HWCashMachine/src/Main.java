import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int accountBalance = 100;

        //Лимит на снятие денег
        int withdrawAmountLimit = 105;
        int withdrawAmount = 0;

        //Лимит на количество снятий в день
        int withdrawalsLimitPerDay = 3;
        int actualWithdrawalsNumber = 1;

        boolean withdrawalsPermission = true;
        boolean goodBye = false;

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Enter amount to withdraw: ");
            withdrawAmount = scanner.nextInt();

            if (withdrawalsLimitPerDay >= actualWithdrawalsNumber && accountBalance >= withdrawAmount && withdrawAmountLimit >= withdrawAmount) {
                withdrawalsPermission = true;
                goodBye = false;
                accountBalance = accountBalance - withdrawAmount;
                actualWithdrawalsNumber++;
                System.out.println("You will get: " + withdrawAmount + "EUR, Your new account balance is: " + accountBalance + " EUR.");
            } else if (actualWithdrawalsNumber >= withdrawalsLimitPerDay && accountBalance > 0) {
                withdrawalsPermission = false;
                goodBye = true;
                System.out.println("You exceeded number of withdrawals per day! Try tomorrow!");
            } else if (accountBalance < withdrawAmount && accountBalance > 0) {
                withdrawalsPermission = false;
                System.out.println("Your account balance is two small, current balance: " + accountBalance + " Try another amount");

            } else if (withdrawAmountLimit < withdrawAmount) {
                withdrawalsPermission = false;
                System.out.println("You try to withdraw more than allowed! Your maximum withdrawal amount is: " + withdrawAmountLimit + " Try another amount");

            } else if (accountBalance==0) {
                goodBye = true;
                System.out.println("Your account balance is: " + accountBalance + " add money to your account to proceed.");
            }
        }while (withdrawalsPermission = true && goodBye == false);


            System.out.println("No more operations are possible today! Good Bye!");


    }

}