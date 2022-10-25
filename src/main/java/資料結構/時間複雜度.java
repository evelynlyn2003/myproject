package 資料結構;

public class 時間複雜度 {
    public static void main(String[] args) {
        int[][] n =
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int i;
        int j;
        int temp;
        System.out.print("原始矩陣：\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("%d  ", n[i][j]); //輸出原始矩陣
            }
            System.out.print("\n");
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (j > i)
                { //將主對角線右上方的陣列元素與主對角線左下方的陣列元素進行單方向交換
                    temp = n[i][j];
                    n[i][j] = n[j][i];
                    n[j][i] = temp;
                }
            }
        }
        System.out.print("轉置矩陣：\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("%d  ", n[i][j]); //輸出原始矩陣的轉置矩陣
            }
            System.out.print("\n");
        }
    }


               }



