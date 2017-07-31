package employee;
/**
 * Created by karodes on 7/22/2017.
 */
public class Employee {
    String fName;
    String lName;
    String depName;
    int id;
    String location;

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", depName='" + depName + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                '}';
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee(String fName, String lName, String depName, int id, String location) {
        this.fName = fName;
        this.lName = lName;
        this.depName = depName;
        this.id = id;
        this.location = location;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
