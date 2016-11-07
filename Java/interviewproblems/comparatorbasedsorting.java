import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;

// Comparator
// reverse sorting
// Comparable

public class TestPad {

  public static void main(String[] args) {
    Employee e1 = new Employee("Dad", 60);
    Employee e2 = new Employee("Rahul", 27);
    Employee e3 = new Employee("Teena", 31);

    Employee[] directory = new Employee[3];
    directory[0] = e1;
    directory[1] = e2;
    directory[2] = e3;

    // Sorting an object + reverse order
    Arrays.sort(directory, Collections.reverseOrder(new EmployeeAgeComparator()));
    System.out.println(Arrays.toString(directory));

    System.out.println("\n\n");
    Arrays.sort(directory);
    System.out.println(Arrays.toString(directory));
  }
}


class EmployeeAgeComparator implements Comparator<Employee> {
  @Override
  public int compare(Employee e1, Employee e2) {
    return e1.age - e2.age;
  }
}


class Employee implements Comparable{
  int age;
  String name;

  public Employee(String name, int age) {
    this.age = age;
    this.name = name;
  }


  @Override
  public String toString(){
    return "The name is " + this.name + " the age is " + this.age + "\n";
  }

  @Override 
  public int compareTo(Object o) {

    if (o instanceof Employee) {
      Employee temp = (Employee)o;
      return this.name.compareTo(temp.name);
    }
    return -1;
  }
}


