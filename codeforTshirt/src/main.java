import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("This is a program for couting the sum of 2 numbers");
        System.out.printf("Now pls enter your 1st number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("\n Okay now is 2nd number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("\n So this is the sum of 2 numbers :" + sum);
    }
}
