package 程式設計;

import java.util.Scanner;        //import Scanner類別

import java.util.Random;         //import Random方法

public class 終極密碼戰 {
    public static void main(String[] args) {         //加入main方法
        Scanner s = new Scanner(System.in);         // 建立scanner物件
        int minNum = 0;         //宣告整數變數minNum，初始值為0
        int maxNum = 100;       //宣告整數變數maxNum，初始值為100
        Random r = new Random();        //宣告產生一個random類別的物件
        int anserNum = r.nextInt(maxNum - minNum) + minNum;     //使用nextInt()方法取得整數數值
        // System.out.println(anserNum);

        while (true){       //while 迴圈
            System.out.println("請猜一個數字 (介於"+ minNum+"到"+maxNum+")");        //題目敘述
            int guessNum = s.nextInt();     //宣告整數變數guessNum為

            if (guessNum == anserNum){      //如果guessNum = anserNum
                System.out.println("你猜到了!答案是"+anserNum);
                break;      //離開while迴圈
            }  if (guessNum < anserNum) {        //對其他情況guessNum < anserNum
                System.out.println("往上猜");
                minNum = guessNum;
            } if (guessNum > anserNum){       //對其他情況guessNum > anserNum
                maxNum = guessNum;
                System.out.println("往下猜");

            }
        }



    }


}
