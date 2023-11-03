import java.util.Scanner;

public class Nilai {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        int nim = input.nextInt();

        System.out.print("Masukkan Nilai Tubes: ");
        double nilaiTubes = input.nextDouble();

        System.out.print("Masukkan Nilai Quiz: ");
        double nilaiQuiz  = input.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();
        
        Penilaian penilaian = new Penilaian();
        double totalnilai = penilaian.totalnilai (nilaiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);
        
        System.out.println("=============================================================");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai  Matakuliah Pemograman Berorientasi Objek:" + totalnilai);
        System.out.println("=============================================================");
        
        input.close();
    }
}