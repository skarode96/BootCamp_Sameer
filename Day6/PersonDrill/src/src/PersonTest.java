import org.junit.Test;

/**
 * Created by karodes on 7/21/2017.
 */
public class PersonTest {
    @Test
    public void test1() {
        Person person1 = new Person("Ramesh","M");
        Person person2 = new Person("Ramesh","M");
        System.out.println(person1.equals(person2));

//        System.out.println("Ramesh".hashCode());
//        System.out.println("Ramesh".hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

    }
    @Test
    public void test2(){
        String name = new String("Sameer");
        String name1 = name.intern();
        String name2 = "Sameer";
        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name1 == name2);
    }

}

