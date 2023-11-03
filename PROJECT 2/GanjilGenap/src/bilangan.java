import java.util.Scanner;

public class bilangan {
    public static void main(String[] args) throws Exception {
        int a;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan Bilangan: ");
        a = scanner.nextInt();

        if ( a % 2 == 0 ) {
            System.out.print ("Bilangan " + a + " adalah bilangan Genap");
        } else {
            System.out.print ("Bilangan " + a + " adalah bilangan Ganjil");
        }
    }
}
