public class Mahasiswa {
    private String nim;
    private String nama;
    private String lahir;
    private String kelamin;

    public Mahasiswa(String nim, String nama, String lahir, String kelamin) {
        this.nama = nama;
        this.nim = nim;
        this.lahir = lahir;
        this.kelamin = kelamin;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
    
    public String getLahir() {
        return lahir;
    }
    
    public String getKelamin() {
        return kelamin;
    }
    
}