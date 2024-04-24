public class Acara {
    private String nama;
    private String lokasi;
    private String tanggal;
    private String waktu;

    public Acara(String nama, String lokasi, String tanggal, String waktu) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
        this.waktu = waktu;
    }

    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public void tampilkanDetailAcara() {
        System.out.println("Nama Acara: " + nama);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Waktu: " + waktu);
    }
                           }
