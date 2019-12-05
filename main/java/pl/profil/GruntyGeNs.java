package pl.profil;

public class GruntyGeNs {

        private String nazwaGrNs;
        private double id1;
        private double id2;
        private double id3;

    public GruntyGeNs(String nazwaGrNs, double id1, double id2, double id3) {
        this.nazwaGrNs = nazwaGrNs;
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
    }



    public String getNazwaGrNs() {
        return nazwaGrNs;
    }

    public void setNazwaGrNs(String nazwaGrNs) {
        this.nazwaGrNs = nazwaGrNs;
    }

    public double getId1() {
        return id1;
    }

    public void setId1(double id1) {
        this.id1 = id1;
    }

    public double getId2() {
        return id2;
    }

    public void setId2(double id2) {
        this.id2 = id2;
    }

    public double getId3() {
        return id3;
    }

    public void setId3(double id3) {
        this.id3 = id3;
    }
}
