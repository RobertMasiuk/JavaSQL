
package library;

/**
 *
 * @author Robert
 */
public class Reader {
    private int id;
    private String name;
    private String lastName;
    private String pesel;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getlastName() {
        return lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPesel() {
        return pesel;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Reader() { }
    public Reader(int id, String name, String lastName, String pesel) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "["+id+"] - "+name+" " +lastName+" - "+pesel;
    }
}
