import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (ler.hasNextLine()) {
            String primeira = ler.nextLine();
            String segunda = ler.nextLine();

            int resultado = encontrarMaiorSubstring(primeira, segunda);
            System.out.println(resultado);
        }

        ler.close();
    }

    public static int encontrarMaiorSubstring(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int[][] matriz = new int[m + 1][n + 1];
        int maiorSubstring = 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    matriz[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    matriz[i][j] = matriz[i - 1][j - 1] + 1;
                    maiorSubstring = Math.max(maiorSubstring, matriz[i][j]);
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        return maiorSubstring;
    }
}
