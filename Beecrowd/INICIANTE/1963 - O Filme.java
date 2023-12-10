import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float i1, i2, aumento;
    i1 = ler.nextFloat();
    i2 = ler.nextFloat();
    aumento = (float)((i2-i1)*100)/i1;
    System.out.printf("%.2f%%%n",aumento);    
    ler.close();
  }
}
