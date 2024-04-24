public class RapatPengurus extends Acara {
    private String agenda;

    public RapatPengurus(String nama, String lokasi, String tanggal, String waktu, String agenda) {
        super(nama, lokasi, tanggal, waktu);
        this.agenda = agenda;
    }

    public String getAgenda() {
        return agenda;
    }

    @Override
    public void tampilkanDetailAcara() {
        super.tampilkanDetailAcara();
        System.out.println("Agenda: " + agenda);
    }
}
