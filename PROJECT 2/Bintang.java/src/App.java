import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka (bilangan ganjil atau genap): ");
        int n = scanner.nextInt();

        int middle = n/2;
        for (int i = 1; i <= n; i++) {
            if (n %2 == 1) {
                if (i <= middle + 1) {
                    for (int j = 1; j <+ i; j++) {
                        System.out.print("*");
                    }
                } else {
                    for (int j = 1; j <= n - i + 1; j++) {
                        System.out.print("*");
                    }
                }
            } else {
                if ( i <= middle ) {
                    for ( int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}