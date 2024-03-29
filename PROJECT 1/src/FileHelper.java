import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHelper {
    private String namaFileDataMahasiswa = "data_mahasiswa.txt";

    public void simpanKeFile(ArrayList<Mahasiswa> daftarMahasiswa) {
        try (PrintWriter writer = new PrintWriter(new File(namaFileDataMahasiswa))) {
            for (Mahasiswa m : daftarMahasiswa) {
                writer.println(m.getNim() + "," + m.getNama() + "," + m.getLahir() + "," + m.getKelamin());
            }
        } catch (IOException e) {
            System.out.println("Terjadi Kesalahan saat menyimpan ke file: " + e.getMessage());
        } 
        
    }

    public ArrayList<Mahasiswa> bacaDariFile() {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(namaFileDataMahasiswa))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    Mahasiswa m = new Mahasiswa (parts[0], parts[1], parts[2], parts[3]);
                    daftarMahasiswa.add(m);
                }
            }
        } catch (IOException e) {

        }
        return daftarMahasiswa;
    }
}
