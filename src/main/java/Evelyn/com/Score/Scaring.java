package Evelyn.com.Score;

import Evelyn.com.Score.GraduateStudent;
import Evelyn.com.Score.student;

public class Scaring {
    public static void main(String[] args) {
        student hank = new student("Hank",60,78);
        student jack = new student("Jack",70,42);
        GraduateStudent jane =new GraduateStudent("Jane",60,78,98);
        jane.name = "Jane";


        jack.print();
        hank.print();
        jane.print();
    }
}
