package comparator;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {

  private int staffNo;
  private String name;
  private double salary;
  private LocalDate joinDate;

  public Employee(int staffNo, String name, double salary, LocalDate joinDate) {

    this.staffNo = staffNo;
    this.name = name;
    this.salary = salary;
    this.joinDate = joinDate;

  }

  public String getName() {
    return name;
  }

  public int getStaffNo() {
    return staffNo;
  }

  public double getSalary() {
    return salary;
  }

  public LocalDate getJoinDate() {
    return joinDate;
  }

  @Override
  // this is required to print the information about the Employee
  public String toString() {
    return "[staffNo=" + this.staffNo + ", name=" + this.name + ", salary=" + this.salary +
        ", joinDate=" + this.joinDate + "]";
  }

  @Override
  // sort the employee based on the staffNo in ascending order
  public int compareTo(Employee emp) {
    // return Integer.compare(this.staffNo, emp.staffNo);
    return (this.staffNo - emp.staffNo);
  }

  /**
   * Comparator to sort employees list or array in order of Salary
   */

  public static Comparator<Employee> salaryComparator = new Comparator<Employee>() { // variable
    @Override
    public int compare(Employee emp1, Employee emp2) {
      return (int) (emp1.getSalary() - emp2.getSalary()); // ascending
      // return emp1.getSalary().compareTo(emp2.getSalary());
    }
  };

}
