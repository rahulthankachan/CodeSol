import java.util.HashMap;
import java.util.Map;

public class TestPad {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Ram");
        Student s2 = new Student(2, "Rahul");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(s1.getId(), s1);
        studentMap.put(s2.getId(), s2);

        Student temp = studentMap.get(1);
        System.out.println("The name of the student is " + temp.getName());

        for (Student temp1 : studentMap.values()) {
            System.out.println("I am " + temp1.getName());
        }

        for (int x : studentMap.keySet()) {
            System.out.println("The id is " + x);
        }

    }
}


class Student {
    private int studentID;
    private String studentName;

    public Student(int id, String name) {
        this.studentID = id;
        this.studentName = name;
    }

    public int getId() {
        return this.studentID;
    }

    public String getName() {
        return studentName;

    }
}
