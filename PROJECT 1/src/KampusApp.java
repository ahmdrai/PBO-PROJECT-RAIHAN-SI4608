import java.util.List;
import java.util.Scanner;

public class KampusApp {
    public static void main(String[] args) {
        KampusApp kampusApp = new KampusApp();
        kampusApp.showMenu();
    }

    private Scanner scanner;
    private Database database;

    public KampusApp() {
        scanner = new Scanner(System.in);
        database = new Database();
    }

    public void showMenu() {
        System.out.println("-------------------------------------");
        System.out.println("Selamat Datang di Aplikasi Kampus");
        System.out.println("Pilihan Menu:");
        System.out.println("1 -> Tambah Data Mahasiswa");
        System.out.println("2 -> Ubah Data Mahasiswa");
        System.out.println("3 -> Hapus Data Mahasiswa");
        System.out.println("4 -> Cari Data Mahasiswa");
        System.out.println("5 -> Tampilkan Semua Data Mahasiswa");
        System.out.println("0 -> Keluar Aplikasi");
        System.out.print("Silahkan masukkan menu yang dipilih: ");
        int menuYangDipilih = scanner.nextInt();

        scanner.nextLine();
        
        switch(menuYangDipilih) {
            case 1:
                menuTambah();
                break;
            case 2:
                menuUbah();
                break;
            case 3:
                menuHapus();
                break;
            case 4:
                menuCari();
                break;
            case 5:
                menuTampil();
                break;
            case 0: {
                System.out.print("* Terima kasih sudah menggunakan Aplikasi Kampus *");
                System.exit(0);
                break;
            }
        }
        scanner.close();
    }

    public void menuTambah() {
        System.out.println("----- Menu Tambah Mahasiswa -----");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tanggal lahir (Contoh: 10 Oktober 2001): ");
        String lahir = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin (Pria/Wanita): ");
        String kelamin = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa (nim, nama, lahir, kelamin);
        database.create(mahasiswa);
        System.out.println("Tekan Enter untuk melanjutkan....");
        scanner.nextLine();
        showMenu();
    }
    
    public void menuUbah() {
        System.out.println("----- Menu Ubah Data Mahasiswa -----");
        System.out.print("Masukkan NIM sebelumnya: ");
        String nimLama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nimBaru = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tanggal lahir (Contoh: 10 Oktober 2001): ");
        String lahir = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin (Pria/Wanita): ");
        String kelamin = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa (nimBaru, nama, lahir, kelamin);
        database.update(mahasiswa, nimLama);
        System.out.println("Tekan Enter untuk melanjutkan....");
        scanner.nextLine();
        showMenu(); 
    }
    
    public void menuHapus() {
        System.out.println("----- Menu Hapus Data Mahasiswa -----");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        database.delete(nim);
        System.out.println("Tekan Enter untuk melanjutkan....");
        scanner.nextLine();
        showMenu();
    }
    
    public void menuCari() {
        System.out.println("----- Menu Cari Data Mahasiswa -----");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        Mahasiswa mahasiswa = database.read(nim);
        if(mahasiswa == null ) {
            System.out.println("* NIM tidak ditemukan *");
        } else {
            System.out.println("* NIM: " + mahasiswa.getNim() + " *"); 
            System.out.println("* Nama: " + mahasiswa.getNama() + " *"); 
            System.out.println("* Tanggal lahir: " + mahasiswa.getLahir() + " *"); 
            System.out.println("* Jenis Kelamin: " + mahasiswa.getKelamin() + " *"); 
        }
        System.out.println("Tekan Enter untuk melanjutkan....");
        scanner.nextLine();
        showMenu();
    }

    public void menuTampil() {
        System.out.println("----- Menu Tampilan Semua Data Mahasiswa -----");
        List<Mahasiswa> semuaMahasiswa = database.getAllData();
        if (semuaMahasiswa.isEmpty()) {
            System.out.println("Tidak Ada Data Mahasiswa");
        } else {
            for (Mahasiswa mahasiswa : semuaMahasiswa) {
                System.out.println("* NIM: " + mahasiswa.getNim() + " *");
                System.out.println("* Nama: " + mahasiswa.getNama() + " *");
                System.out.println("* Tanggal lahir: " + mahasiswa.getLahir() + " *");
                System.out.println("* Jenis Kelamin: " + mahasiswa.getKelamin() + " *");
                System.out.println("===============================================");

            }
        }
        System.out.println("Tekan Enter untuk melanjutkan....");
        scanner.nextLine();
        showMenu();
    }
}