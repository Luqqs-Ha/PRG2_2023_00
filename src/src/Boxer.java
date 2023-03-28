public class Boxer extends Person
{
    int gewicht;

    public Boxer(String name, String vorname, int gewicht) {
        super(name, vorname);
        this.gewicht = gewicht;
    }

    public int getGewicht() {
        return gewicht;
    }

    @Override
    public String toString() {
        String gewichtString = String.valueOf(gewicht);
        return super.toString() + " " + gewichtString;
    }
}
