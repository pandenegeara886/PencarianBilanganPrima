import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan bilangan pertama : ");
        a = sc.nextInt();
        System.out.print("Masukan bilangan Terakhir : ");
        b = sc.nextInt();
        System.out.print("hasil bilangan prima : ");

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }


    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
