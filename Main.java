public class Main {
    public static void main(String[] args) {
        PenjadwalanAcara penjadwalan = new PenjadwalanAcara();

        KelasPBO kelasPBO = new KelasPBO("Kelas PBO", "Ruang B4B", "Kamis", "10:00", "Pemrograman Berorientasi Objek");
        penjadwalan.tambahAcara(kelasPBO);

        RapatPengurus rapatPengurus = new RapatPengurus("Rapat Pengurus HMTI", "Ruang B4C", "Senin", "14:00", "Pembahasan Kegiatan HMTI");
        penjadwalan.tambahAcara(rapatPengurus);

        LatihanNgobar latihanNgobar = new LatihanNgobar("Latihan Ngobar", "Ruang B4A", "Sabtu", "10:00", "Pemrograman Java");
        penjadwalan.tambahAcara(latihanNgobar);

        penjadwalan.tampilkanSemuaAcara();
    }
}
