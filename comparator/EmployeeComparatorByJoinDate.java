package comparator;

import java.util.Comparator;

public class EmployeeComparatorByJoinDate implements Comparator<Employee> {

  @Override
  public int compare(Employee emp1, Employee emp2) {
    return emp1.getJoinDate().compareTo(emp2.getJoinDate());
  }

}
