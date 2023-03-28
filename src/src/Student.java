public class Student extends Person
{

    int matrikelnummer;

    public Student(String name, String vorname, int matrikelnummer) {
        super(name, vorname);
        this.matrikelnummer = matrikelnummer;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    @Override
    public String toString() {
        String matrikelnummerString = String.valueOf(matrikelnummer);
        return super.toString() + " " + matrikelnummerString;
    }
}
