public class LatihanNgobar extends Acara {
    private String tema;

    public LatihanNgobar(String nama, String lokasi, String tanggal, String waktu, String tema) {
        super(nama, lokasi, tanggal, waktu);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public void tampilkanDetailAcara() {
        super.tampilkanDetailAcara();
        System.out.println("Tema: " + tema);
    }
}
