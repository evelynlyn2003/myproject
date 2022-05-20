package Evelyn.com.Score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        student jack = new student("Jack",60,78);
        student hank = new student("Hank",66,88);
        GraduateStudent jane =
                new GraduateStudent("Jane",65,82,79);
        List<student> students = new ArrayList<>();
        students.add(jack);
        students.add(hank);
        students.add(jane);
        for (int i=0; i<students.size(); i++){
            student stu = students.get(i);
            stu.print();
        }
    }
}
