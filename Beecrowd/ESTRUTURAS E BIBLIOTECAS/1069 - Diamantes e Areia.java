import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a1, a2, n;
        String linha;
        n = ler.nextInt();
        linha = ler.nextLine();
        for(int j = 0; j < n; j++){
            linha = ler.nextLine();
            a1 = 0;
            a2 = 0;
            for(int i = 0; i < linha.length(); i++) {
                if (linha.charAt(i) == '<') {
                    a1++;
                } else if (linha.charAt(i) == '>') {
                    if (a1 > a2) {
                        a2++;
                    }
                }
            }
            System.out.println(a2);
        }
        ler.close();
    }
}
