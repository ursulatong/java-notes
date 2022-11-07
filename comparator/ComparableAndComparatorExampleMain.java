package comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparatorExampleMain {

  public static void main(String[] args) {

    List<Employee> employees = new ArrayList<>();

    // traditional way to create a new instance first
    // Employee employees1 = new Employee(1010, "Atom", 100000.00,
    // LocalDate.of(2020, 1, 1));
    // employees.add(employees1);

    employees.add(new Employee(1010, "Atom", 100000.01, LocalDate.of(2020, 1, 1)));
    employees.add(new Employee(1004, "Ben", 95000.50, LocalDate.of(2020, 1, 11)));
    employees.add(new Employee(1015, "Coco", 134000.03, LocalDate.of(2020, 1, 28)));
    employees.add(new Employee(1009, "Doggy", 100000.04, LocalDate.of(2020, 1, 18)));

    System.out.println("My List Of Emmployees : ");
    // print My List Of Emmployees :
    // [staffNo=1010, name=Atom, salary=100000.01, joinDate=2020-01-01]
    // [staffNo=1004, name=Ben, salary=95000.5, joinDate=2020-01-11]
    // [staffNo=1015, name=Coco, salary=134000.03, joinDate=2020-01-28]
    // [staffNo=1009, name=Doggy, salary=100000.04, joinDate=2020-01-18]

    // method 1
    for (Employee myList : employees) {
      System.out.println(myList.toString());
    }

    // method 2
    {
      employees.forEach(
          e -> System.out.println(e.toString()));
      // lambda expression
    }
    {
      // method 3
      employees.forEach(System.out::println); // method reference
    }
    {
      // sorting by name
      {
        System.out.println("Before Sorting: " + employees);
      }
      Collections.sort(employees);
      System.out.println("After sorting: " + employees);
      // After sorting: [[staffNo=1004, name=Ben, salary=95000.5,
      // joinDate=2020-01-11], [staffNo=1009, name=Doggy, salary=100000.04,
      // joinDate=2020-01-18], [staffNo=1010, name=Atom, salary=100000.01,
      // joinDate=2020-01-01], [staffNo=1015, name=Coco, salary=134000.03,
      // joinDate=2020-01-28]]
    }
    {
      Collections.sort(employees, Employee.salaryComparator);
      System.out.println("After sorting by salary: " + employees);
      // ascending order:
      // After sorting by salary: [[staffNo=1004, name=Ben, salary=95000.5,
      // joinDate=2020-01-11], [staffNo=1009, name=Doggy, salary=100000.04,
      // joinDate=2020-01-18], [staffNo=1010, name=Atom, salary=100000.01,
      // joinDate=2020-01-01], [staffNo=1015, name=Coco, salary=134000.03,
      // joinDate=2020-01-28]]
    }

    {
      EmployeeComparatorByJoinDate sortbyJoinDate = new EmployeeComparatorByJoinDate();
      Collections.sort(employees, sortbyJoinDate);
      System.out.println("After sorting by joinDate: " + employees);
      /// ascending order:
      // After sorting by joinDate: [[staffNo=1010, name=Atom, salary=100000.01,
      // joinDate=2020-01-01],
      // [staffNo=1004, name=Ben, salary=95000.5, joinDate=2020-01-11],
      // [staffNo=1009, name=Doggy, salary=100000.04, joinDate=2020-01-18],
      // [staffNo=1015, name=Coco, salary=134000.03, joinDate=2020-01-28]]
    }
  }
}