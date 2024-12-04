import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sekund,h,m,s ;

        while (true) {
            System.out.print("Sekundni kiriting:");
            sekund = in.nextInt();

            if (sekund > 0) {       // To'g'ri bo'lsa.
                break;
            }

            System.out.println("Musbat son kiriting!"); // Noto'g'ri bo'lsa.

        }

        h = sekund / 3600 % 24 ;
        m = sekund % 3600 /60 ;
        s = sekund % 60 ;

        System.out.println("Digital hours: "+h+":"+m+":"+s);



    }
}