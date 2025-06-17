package myapp;

public class Hulajnoga {
    private String id;
    private boolean dostepna;
    private double poziomBaterii; // в %

    public Hulajnoga(String id, double poziomBaterii) {
        this.id = id;
        this.poziomBaterii = poziomBaterii;
        this.dostepna = true;
    }

    public boolean wypozycz() {
        if (!dostepna || poziomBaterii < 10) {
            return false;
        }
        dostepna = false;
        return true;
    }

    public void zwroc(double zuzycieBaterii) {
        this.dostepna = true;
        this.poziomBaterii = Math.max(0, poziomBaterii - zuzycieBaterii);
    }

    public String getId() {
        return id;
    }

    public boolean isDostepna() {
        return dostepna;
    }

    public double getPoziomBaterii() {
        return poziomBaterii;
    }

    @Override
    public String toString() {
        return "Hulajnoga{" +
                "id='" + id + '\'' +
                ", dostepna=" + dostepna +
                ", poziomBaterii=" + poziomBaterii + "%}";
    }
}
