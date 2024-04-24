import java.util.ArrayList;
import java.util.List;

public class PenjadwalanAcara {
    private List<Acara> acara;

    public PenjadwalanAcara() {
        acara = new ArrayList<>();
    }

    public void tambahAcara(Acara acara) {
        this.acara.add(acara);
    }

    public void tampilkanSemuaAcara() {
        for (Acara acara : acara) {
            acara.tampilkanDetailAcara();
            System.out.println();
        }
    }
}
