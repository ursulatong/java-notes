package lambda;

interface Age {

  void getAge(int x);
}

public class MyClass {

  public static void main(String[] args) {

    Age obj = (int x) -> System.out.println(2 * x);

    obj.getAge(5);
  }
}
