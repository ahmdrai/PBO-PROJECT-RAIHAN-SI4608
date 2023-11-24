import Company.*;

public class App {
    public static void main(String[] args) {
        
        Direktur direktur = new Direktur();
        direktur.nama = "Johan";
        System.out.println(direktur.nama);
        direktur.jabatan = "Direktur Utama";
        System.out.println(direktur.jabatan);
        direktur.email = "johan@gmail.com";
        System.out.println(direktur.email);
        direktur.nip = "1202223388";
        System.out.println(direktur.nip);
        direktur.sop();
        direktur.detailJob();
        System.out.println();

        Manajer manajer = new Manajer();
        manajer.nama = "Polling";
        System.out.println(manajer.nama);
        manajer.jabatan = "Kepala Divisi Sales";
        System.out.println(manajer.jabatan);
        manajer.email = "polling@gmail.com";
        System.out.println(manajer.email);
        manajer.sop();
        manajer.detailJob();
        System.out.println();

        Staff staff = new Staff( );
        staff.nama = "Wokwi";
        System.out.println(staff.nama);
        staff.jabatan = "Staff Sales";
        System.out.println(staff.jabatan);
        staff.email = "wokwi@gmail.com";
        System.out.println(staff.email);
        staff.jobInDivison = "Sales Representative";
        System.out.println(staff.jobInDivison);
        staff.sop();
        staff.detailJob();

    }
}
