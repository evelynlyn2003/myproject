package Evelyn.com;

public class Helloworld {
    public static void main(String[] args) {
        String[] names = {"jack", "Hank", "Elva", "Benny"};
        int[] english = {70,80,90,60,48};
        int[] maths={88,97,54,32,75};
        for (int i = 0;i<5;i++){
            if (i!=3)
            System.out.println(names[i] + "\t" + english[i] + "\t" + maths[i] );

        }
    }
}
