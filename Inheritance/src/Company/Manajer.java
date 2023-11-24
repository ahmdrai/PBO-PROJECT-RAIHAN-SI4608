package Company;

public class Manajer extends Employee {
    
    public String divisi;

    @Override
    public void sop() {
        super.sop();
        System.out.println("Standar Operasional Prosedur Perusahaan khusus Manajer");
    }

    @Override
    public void detailJob() {
        System.out.println("Memimpin, Mengarahkan dan Mengawasi Staff");
    }
    
}
