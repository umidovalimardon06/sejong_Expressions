import  java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son,digit100;


        while (true) {
            System.out.print("Sonni (10000-99999) kiriting:");
            son = in.nextInt();

            if (son<=99999 && son>=10000) {
                break;     // To'g'ri bo'lsa.
            }

            System.out.println("Intervalga to'g'ri kelmaydi,Qaytadan uruning!");
        }

        digit100 = son % 1000 / 100 ;

        System.out.println("100-xonadagi son: "+digit100);

    }
}
