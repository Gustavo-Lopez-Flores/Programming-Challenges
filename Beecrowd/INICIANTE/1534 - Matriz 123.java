import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX = 70;
        int i, j, num;
        int mat[][] = new int[MAX][MAX];
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            num = input.nextInt();
            if (num > 2) {
                for (i = 0; i < num; i++) {
                    for (j = 0; j < num; j++) {
                        if (j + i == (num - 1)) {
                            mat[i][j] = 2;
                        } else if (j == i) {
                            mat[i][j] = 1;
                        } else {
                            mat[i][j] = 3;
                        }
                        System.out.print(mat[i][j]);
                    }
                    System.out.println();
                }
            }
        }
        input.close();
    }
}
