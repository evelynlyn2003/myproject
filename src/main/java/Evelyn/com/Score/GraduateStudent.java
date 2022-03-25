package Evelyn.com.Score;

import Evelyn.com.Score.student;

public class GraduateStudent extends student {
    int thesis;
public GraduateStudent(String name,int english,
        int math,int thesis){
    super(name,english,math);
    this.thesis=thesis;

}
}
