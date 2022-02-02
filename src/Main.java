import java.util.Scanner;

public class Main {
    private static final int USERAGE = 16;
    private static final float INCOME = 1000;
    public static void main(String[] args) {
	int userAge = askUserAge();
    double userIncome = askUserIncome();
    String anserOfHasToPay = askHasToPayIncomeTheUser(userAge,userIncome);
    asnwerOfHasToPayTribute(anserOfHasToPay);
    }

    private static void asnwerOfHasToPayTribute(String anserOfHasToPay) {
        System.out.println("The user has to pay a tribute? "+ anserOfHasToPay);
    }

    private static String askHasToPayIncomeTheUser(int userAge, double userIncome) {
        return comprovateUserAgeAndUserIncome( userAge,  userIncome);
    }

    private static String comprovateUserAgeAndUserIncome(int userAge, double userIncome) {
        if(userAge >= USERAGE && userIncome >= INCOME)
        {
            return "Yes";
        }
        return "No";
    }

    private static double askUserIncome() {
        System.out.println("Write the income of the user");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    private static int askUserAge() {
        System.out.println("Write the user age");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
