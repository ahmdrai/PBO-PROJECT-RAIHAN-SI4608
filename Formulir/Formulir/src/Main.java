public class Main {
    public static void main(String[] args) {
        FormulirMahasiswa formulir_01 = new FormulirMahasiswa();
        formulir_01.cara_bayar();
        formulir_01.tata_tertib();

        FormulirDosen formulir_02 = new FormulirDosen();
        formulir_02.cara_bayar();
        formulir_02.tata_tertib();
        
        FormulirAdmin formulir_03 = new FormulirAdmin();
        formulir_03.cara_bayar();
        formulir_03.tata_tertib();
    }
}
