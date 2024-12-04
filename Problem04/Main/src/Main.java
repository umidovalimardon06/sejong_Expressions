import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son ;

        while (true) {
            System.out.print("Sonni (10000-99999) kiritng:");
            son = in.nextInt();

            if (son>=10000 && son<=99999) {
                break;
            }

            System.out.print("Intervalga to'g'ri kelmaydi!,qayta uruning:");
        }

        son = (int) Math.round(son/1000.0);
        son *=1000;

        System.out.println(son);


    }
}