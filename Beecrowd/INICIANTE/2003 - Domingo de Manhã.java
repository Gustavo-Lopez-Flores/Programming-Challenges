import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int h, m, aM;
    while(ler.hasNext()) {
        ler.useDelimiter(":|\n");
        h = ler.nextInt();
        m = ler.nextInt();
        aM = ((60*h)+(m+60)) - 480;
        aM = aM <= 0 ? 0: aM;
        System.out.printf("Atraso maximo: %d%n", aM);
    }
    ler.close();
  }
}
