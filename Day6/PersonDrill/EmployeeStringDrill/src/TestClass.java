import comparator.EmployeeComparator;
import comparator.IdComparator;
import comparator.NameComparator;
import employee.Employee;
import org.junit.Test;
import utility.CustomSort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by karodes on 7/22/2017.
 */
public class TestClass {
    @Test
    public void test1(){
        ArrayList<Employee> employeesList = new ArrayList<Employee>();

        employeesList.add(new Employee("Sameer","Karode","RnD",234,"Pune"));
        employeesList.add(new Employee("Sameer","Bhavasar","RnD",235,"Pune"));
        employeesList.add(new Employee("Rajesh","Naik","Finance",236,"Pune"));
        employeesList.add(new Employee("Deepesh","Naik","Finance",237,"Pune"));
        employeesList.add(new Employee("Rajan","Birud","HR",238,"Pune"));
        employeesList.add(new Employee("Nitesh","Bagle","RnD",239,"Hyderabad"));
        employeesList.add(new Employee("Amey","Khanna","RnD",240,"Hyderabad"));
        employeesList.add(new Employee("Yash","Rathod","Finance",241,"Hyderabad"));
        employeesList.add(new Employee("Husain","Kapadia","Finance",242,"Hyderabad"));
        employeesList.add(new Employee("Sneh","Sopori","HR",243,"Hyderabad"));
        employeesList.add(new Employee("Mahesh","Jagtap","Finance",244,"Pune"));
        employeesList.add(new Employee("Neeta","Dayani","Finance",245,"Pune"));
        employeesList.add(new Employee("Geeta","Mawani","Finance",246,"Pune"));
        employeesList.add(new Employee("Seeta","Motwani","Finance",247,"Pune"));
        employeesList.add(new Employee("Meeta","Lokhandwala","Finance",248,"Pune"));
        employeesList.add(new Employee("Babita","Lokhandwala","RnD",249,"Pune"));
        employeesList.add(new Employee("Jaggu","Jasoos","RnD",250,"Pune"));
        employeesList.add(new Employee("Sushant","Bhaskar","RnD",251,"Pune"));
        employeesList.add(new Employee("Binay","Sawant","RnD",252,"Pune"));
        employeesList.add(new Employee("Snigdha","Sahoo","RnD",253,"Pune"));
        CustomSort.sort(employeesList,new EmployeeComparator(new IdComparator(),new NameComparator()));
        for (Employee employee:employeesList
             ) {
            System.out.println(employee);
        }

    }

    @Test
    public void test2(){

    }

}
