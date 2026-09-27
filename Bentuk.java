public class Bentuk {
    protected String warna; // Variabel warna

    // Constructor[cite: 6]
    public Bentuk(String warna) {
        this.warna = warna;
    }

    // Mengembalikan nilai variabel warna[cite: 6]
    public String getWarna() {
        return warna;
    }

    // Mengubah nilai variabel warna[cite: 6]
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Menampilkan informasi bentuk[cite: 6]
    public void printInfo() {
        System.out.println("Bentuk berwarna " + warna);
    }
}