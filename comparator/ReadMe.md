# Comparable and Comparator

### Why we need to use comparable and comparator?


When we need to sort an object array or list, we need to implement _Comparable interface_ to provide default sorting and we should implement _Comparator interface_ to provide different ways of sorting. 

Comparable and Comparator interfaces use Generics for compile-time type checking.

##Comparable

Java provides Comparable interface which should be implemented by any custom class if we want to use Arrays or Collections sorting methods. The Comparable interface has _compareTo(T obj)_ method which is used by sorting methods. We should override this method in such a way that it returns a negative integer, zero, or a positive integer if “this” object is less than, equal to, or greater than the object passed as an argument. 

```
public class EmployeeWithComparable implements Comparable<Employee> {

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
    return Integer.compare(this.staffNo, emp.staffNo);
```

## Comparator


In most real-life scenarios, we want sorting based on different parameters. For example, as a CEO, I would like to sort the employees based on Salary, an HR would like to sort them based on age. This is the situation where we need to use Java Comparator interface because Comparable.compareTo(Object o) method implementation can provide default sorting and we can’t change it dynamically. Whereas with Comparator, we can define multiple methods with different ways of sorting and then chose the sorting method based on our requirements.

#### How does Comparator work?

Comparator interface compare(Object o1, Object o2) method need to be implemented that takes two Object argument, it should be implemented in such a way that it returns negative int if the first argument is less than the second one and returns zero if they are equal and positive int if the first argument is greater than the second one. 


### Comparable vs Comparator
- Comparable interface can be used to provide single way of sorting whereas Comparator interface is used to provide different ways of sorting.
- For using Comparable, Class needs to implement it whereas for using Comparator we don’t need to make any change in the class.
- Comparable interface is in java.lang package whereas Comparator interface is present in java.util package.
- We don’t need to make any code changes at client side for using Comparable, Arrays.sort() or Collection.sort() methods automatically uses the compareTo() method of the class. For Comparator, client needs to provide the Comparator class to use in compare() method.

https://www.digitalocean.com/community/tutorials/comparable-and-comparator-in-java-example