public class Main {
    public static void main(String[] args) {

        Bentuk b = new Bentuk("Merah");
        b.printInfo();

        BujurSangkar bs = new BujurSangkar(5, "Biru");
        bs.printInfo();

        Lingkaran l = new Lingkaran(7, "Kuning");
        l.printInfo();

        Silinder s = new Silinder(10, 7, "Hijau");
        s.printInfo();
    }
}
