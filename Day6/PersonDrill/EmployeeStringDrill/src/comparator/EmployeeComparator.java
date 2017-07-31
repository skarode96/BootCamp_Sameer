package comparator;

import employee.Employee;

import java.util.Comparator;

/**
 * Created by karodes on 7/22/2017.
 */
public class EmployeeComparator implements Comparator<Employee> {
    public Comparator<Employee>[] comparables;
    public EmployeeComparator(Comparator<Employee> ... comparators) {
        this.comparables = comparators;
    }

//    @Override
//    public int compare(Employee o1, Employee o2) {
//        int comparaVal;
//        comparaVal = o1.getfName().compareTo(o2.getfName());
//        if(comparaVal != 0)
//            return  comparaVal;
//        comparaVal = o1.getlName().compareTo(o2.getlName());
//        if(comparaVal != 0)
//            return comparaVal;
//        comparaVal = (o1.getId() - o2.getId());
//        if(comparaVal != 0)
//            return  comparaVal;
//        comparaVal = o1.getLocation().compareTo(o2.getLocation());
//        if(comparaVal != 0)
//            return  comparaVal;
//        else
//            return 0;
//    }

    @Override
    public int compare(Employee o1, Employee o2) {

    }
}
