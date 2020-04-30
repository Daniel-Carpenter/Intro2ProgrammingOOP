import java.util.ArrayList;

public class Course {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>(5);

        Student first = new Student("Shrek", 42, 91, 83);
        Student second = new Student("Fiona", 90, 62, 75);
        Student third = new Student("Donkey", 22, 100, 83);
        
        students.add(first);
        students.add(0, second);
        students.add(1, third);

        Student update = students.get(1);
        update.setMidterm1(89);
        update = students.get(2);
        update.setMidterm3(76);
    }
}
