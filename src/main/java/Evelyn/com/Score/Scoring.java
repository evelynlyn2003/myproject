package Evelyn.com.Score;

public class Scoring {
    public static void main(String[] args) {
        student jack = new student("Jack",60,78);
        student hank = new student("Hank",66,88);
        GraduateStudent jane =
                new GraduateStudent("Jane",65,82,79);
       jack.print();
       hank.print();
       jane.print();
        }
    }

