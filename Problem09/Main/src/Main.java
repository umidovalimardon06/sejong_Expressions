import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int num1,num2;

        System.out.print("Enter num1:");
        num1 = in.nextInt();
        System.out.print("Enter num2:");
        num2 = in.nextInt();

        System.out.println(Math.max(num1,num2)+" is large");



    }
}