/**
 * Created by karodes on 7/21/2017.
 */
public class Person {
    String name;
    String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int newHashCode = 0;
        newHashCode = this.getName().hashCode() + this.getGender().hashCode();
        return newHashCode;
    }


    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        if(obj == null) {
            System.out.println("Null pointer exception");
            return false;
        }
        if(this.getName().equals(person.getName()) && this.getGender().equals(person.getGender())) {
            return true;
        }
        else
            return false;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
