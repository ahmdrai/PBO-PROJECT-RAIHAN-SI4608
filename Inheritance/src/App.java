import Company.*;

public class App {
    public static void main(String[] args) {
        
        Direktur direktur = new Direktur();
        direktur.sop();
        direktur.detailJob();

        Manajer manajer = new Manajer();
        manajer.sop();
        manajer.detailJob();

        Staff staff = new Staff( );
        staff.sop();
        staff.detailJob();

    }
}
