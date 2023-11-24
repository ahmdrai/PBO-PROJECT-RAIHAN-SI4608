import java.util.Scanner;

import Model.Layout;
import Model.Position;
import Model.Robot;

public class RobotApp {
    public static void main(String[] args){
        new RobotApp();
    }

    /*
     * Perintah Soal:
     * Anggap 'o' adalah sebuah robot yang berada didalam area permainan.
     * Buat robot dapat bergerak ke kiri/kanan/atas/bawah sesuai jumlah langkah yang diinstruksikan.
     * Format instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah} dan 'x' untuk keluar aplikasi *case sensitive
     * Robot tidak boleh keluar dari area permainan dan buat pesan kesalahannya.
     * Buat pesan kesalahan jika pengguna tidak menulis instruksi dengan benar.
     * Lanjut pada perintah soal dibawah.
     */

    private Layout layout;
    private Robot robot;
    private Scanner scanner;

    public RobotApp() {
        // contoh konfigurasi (inisiasi object layout) area permainan: X = 10, Y = 10, icon area yang tidak ditempati robot adalah '*'
        this.layout = new Layout(10, 10, '*');
        this.scanner = new Scanner(System.in);
        String instruction = "";

        robot = new Robot('o', new Position(0, 0));
        System.out.println("-------- Permainan Dimulai --------");

        do {
            draw();
            instruction = waitInstruction();

            if (!instruction.equals("x")) {
                char direction = instruction.charAt(0);
                int amount = Integer.parseInt(instruction.substring(1));
                Position p = robot.getPosition();

                switch (direction) {
                    case 'w':
                        p.setY(p.getY() - amount);
                        break;
                    case 'a':
                        p.setX(p.getX() - amount);
                        break;
                    case 's':
                        p.setY(p.getY() + amount);
                        break;
                    case 'd':
                        p.setX(p.getX() + amount);
                        break;
                    default:
                        break;
                }

                robot.setPosition(p);
            }

        } while (!instruction.equals("x"));

        System.out.println("-------- Permainan Selesai --------");
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'keatas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");

        /*
        Gambar layout:
        Contoh:
        - Posisi robot di 1,1
        - Area permainan luasnya 10,10
        sehingga gambar layout akan menjadi:

            o*********
            **********
            **********
            **********
            **********
            **********
            **********
            **********
            **********
            **********

            - konfigurasi (icon robot, posisi robot, luas area dan icon area permainan yang tidak ditempati robot) silahkan gunakan prinsip OOP
            - icon cukup menggunakan karakter yang ada di keyboard.
        */

        char[][] area = layout.getArea();
        Position rPosition = robot.getPosition();
        int x = rPosition.getX();
        int y = rPosition.getY();

        area[y][x] = robot.getIcon();
        for (char[] col : area) System.out.println(col);
        area[y][x] = layout.getIcon();
    }
}
