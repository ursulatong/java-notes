package comparator;

import java.util.Comparator;

/*separate class implementation of Comparator interface that will compare 
two Employees object first on their staffNo and if they are same then on the name.
*/

public class EmployeeComparatorBystaffNoAndName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int flag = o1.getStaffNo() - o2.getStaffNo();
        if (flag == 0)
            flag = o1.getName().compareTo(o2.getName());
        return flag;
    }

}
