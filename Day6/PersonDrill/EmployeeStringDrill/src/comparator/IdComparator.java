package comparator;

import employee.Employee;

import java.util.Comparator;

/**
 * Created by karodes on 7/26/2017.
 */
public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId() -  o2.getId();
    }
}
