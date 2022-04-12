import java.util.ArrayList;
import java.util.Collections;

public class Sort02 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("박명건");
        students.add("강현찬");
        students.add("이재혁");
        students.add("이성준");

        Collections.sort(students);
        Collections.reverse(students);

        System.out.println(students);
    }
}
