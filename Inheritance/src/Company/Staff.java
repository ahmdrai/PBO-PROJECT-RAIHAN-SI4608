package Company;

public class Staff extends Employee {
    
    public String divisi;
    public String jobInDivison;
    
    @Override
    public void sop() {
        super.sop();
        System.out.println("Standar Operasional Prosedur Perusahaan khusus Staff");
    }

    @Override
    public void detailJob() {
        System.out.println("Mengerjakan Operasional Harian Perusahaan");
    }
    
}
