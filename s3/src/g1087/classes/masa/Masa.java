package g1087.classes.masa;
import g1087.classes.masa.PozitieMasa;
public class Masa {
    private int Id;
    private int nrScaune;
    private boolean esteDisponibila;
    private PozitieMasa pozitieMasa;

    public Masa(int id, int nrScaune, boolean esteDisponibila, PozitieMasa pozitieMasa) {
        Id = id;
        this.nrScaune = nrScaune;
        this.esteDisponibila = esteDisponibila;
        this.pozitieMasa = pozitieMasa;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getNrScaune() {
        return nrScaune;
    }

    public void setNrScaune(int nrScaune) {
        this.nrScaune = nrScaune;
    }

    public boolean isEsteDisponibila() {
        return esteDisponibila;
    }

    public void setEsteDisponibila(boolean esteDisponibila) {
        this.esteDisponibila = esteDisponibila;
    }

    public PozitieMasa getPozitieMasa() {
        return pozitieMasa;
    }

    public void setPozitieMasa(PozitieMasa pozitieMasa) {
        this.pozitieMasa = pozitieMasa;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "Id=" + Id +
                ", nrScaune=" + nrScaune +
                ", esteDisponibila=" + esteDisponibila +
                ", pozitieMasa=" + pozitieMasa +
                '}';
    }
}

