import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son;

        System.out.print("Sonni kiriting:");
        son = in.nextInt();

        if (son<=30 && son>=20) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }



    }
}