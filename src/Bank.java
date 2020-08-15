import java.util.Scanner;

public class Bank {

    public static void pay(int sum, int credit) {
        Scanner scanner = new Scanner(System.in);
        if(sum == credit) {
            System.out.println("Кредит погашен");
        } else if (sum > credit) {
            System.out.println("Кредит погашен, отстаток: " + (sum - credit));
        } else {
            System.out.println("Не достаточно денег, доплатите: " + (credit - sum));
            int payment = scanner.nextInt();
            pay(payment, credit - sum);
        }
    }

    public static void main(String[] args) {
        pay(100, 1000);
    }
}
