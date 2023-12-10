import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX = 20;
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        ler.nextLine();
        for (int i = 0; i < n; i++) {
            String s = ler.nextLine();
            int t = 0;
            if (s.equals("P=NP")) {
                System.out.println("skipped");
            } else {
                String[] tokens = s.split("\\+");
                for (String token : tokens) {
                    t += Integer.parseInt(token);
                }
                System.out.println(t);
            }
        }
        ler.close();
    }
}
