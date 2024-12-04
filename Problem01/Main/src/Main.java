import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son,xona1,xona2,xona3,xona4,xona5;

        while (true) {
            System.out.print("Sonni kiriting (0 dan 99999 gacha): ");
            son = in.nextInt();

            if (son >= 0 && son <= 99999) {
                break; // to'g'ri intervalda son kiritilganda sikl to'xtaydi
            }

            System.out.println("Intervalga to'g'ri kelmaydi! Qayta urinib ko'ring.");
        }

        xona1 = son / 10000;
        xona2 = son / 1000 % 10;
        xona3 = son / 100 % 10 ;
        xona4 = son / 10 % 10 ;
        xona5 = son % 10 ;

        System.out.println(xona1+"!"+xona2+"!"+xona3+"!"+xona4+"!"+xona5);


    }
}