import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int raqam ;

        System.out.print("Enter number:");
        raqam = Math.abs(in.nextInt());

        if (raqam%2>0) {
            System.out.println("Toq");
        } else {
            System.out.println("Juft");
        }

    }
}