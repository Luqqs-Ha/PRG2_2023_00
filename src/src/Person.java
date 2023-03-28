public abstract class Person
{

    String name;
    String vorname;

    public Person(String name, String vorname)
    {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    @Override
    public String toString() {
        return "" + vorname + "," + name;
    }
}
