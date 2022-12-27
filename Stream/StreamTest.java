package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
  private String name;
  private int salary;
  private int age;
  private String sex;
  private String area;

  public Person(String name, int salary, int age, String sex, String area) {
    this.name = name;
    this.salary = salary;
    this.age = age;
    this.sex = sex;
    this.area = area;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public void setSalary(int salary) {
    this.salary = salary;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public void setSex(String sex) {
    this.sex = sex;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getName() {
    return this.name;
  }

  public int getSalary() {
    return this.salary;
  }

  public int getAge() {
    return this.age;
  }

  public String getSex() {
    return this.sex;
  }

  public String getArea() {
   return this.area;
  }
}

public class StreamTest {

  public static void main(String[] args) {

    List<Person> personList = new ArrayList<>();
    personList.add(new Person("Tom", 8900, 30, "male", "New York"));
    personList.add(new Person("Jack", 7000, 30, "male", "Washington"));
    personList.add(new Person("Lily", 7800, 25, "female", "Washington"));
    personList.add(new Person("Anni", 8200, 32, "female", "New York"));
    personList.add(new Person("Owen", 9500, 30, "male", "New York"));
    personList.add(new Person("Alisa", 7900, 35, "female", "New York"));

    //筛选员工中，并形成新的集合。 形成新集合依赖collect（收集)
    List<String> filterList = personList.stream().filter(x -> x.getSalary() > 8000).map(Person::getName)
        .collect(Collectors.toList());
    System.out.print("工資高于8000的人: " + filterList);

    // 获取薪資最大值的人
  Optional<Person> max = personList.stream().max(Comparator.comparingInt(Person::getSalary));
  System.out.print("員工薪資最大值: " + max.get().getName());

  // 将员工的薪资全部增加10000
  List<Person> personListNew2 = personList.stream().map(person -> { person.setSalary(person.getSalary() + 10000);
    return person;
  }).collect(Collectors.toList());
  System.out.print("员工的新薪资: " + personListNew2.get(0).getSalary());

  

  }
  
}
