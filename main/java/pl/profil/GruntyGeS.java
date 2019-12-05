package pl.profil;

public class GruntyGeS {

    private String nazwaGrS;
    double il1;
    double il2;
    double il3;
    double il4;

    public GruntyGeS(String nazwaGrS, double il1, double il2, double il3, double il4) {
        this.nazwaGrS = nazwaGrS;
        this.il1 = il1;
        this.il2 = il2;
        this.il3 = il3;
        this.il4 = il4;
    }

    public String getNazwaGrS() {
        return nazwaGrS;
    }

    public void setNazwaGrS(String nazwaGrS) {
        this.nazwaGrS = nazwaGrS;
    }

    public double getIl1() {
        return il1;
    }

    public void setIl1(double il1) {
        this.il1 = il1;
    }

    public double getIl2() {
        return il2;
    }

    public void setIl2(double il2) {
        this.il2 = il2;
    }

    public double getIl3() {
        return il3;
    }

    public void setIl3(double il3) {
        this.il3 = il3;
    }

    public double getIl4() {
        return il4;
    }

    public void setIl4(double il4) {
        this.il4 = il4;
    }
}
