import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int   num1,num2,small,large;

        num1 = in.nextInt();
        num2 = in.nextInt();

        small = Math.min(num1,num2);
        large = Math.max(num1,num2);

        System.out.println("Quotient: "+(large/small));
        System.out.println("Reminder: "+(large%small));



    }
}