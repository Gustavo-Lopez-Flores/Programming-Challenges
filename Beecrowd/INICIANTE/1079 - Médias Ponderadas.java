import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, qntd;
    float num1, num2, num3, media;
    qntd = ler.nextInt();
    for(i=1;i<=qntd;i++){
      num1 = ler.nextFloat();
      num2 = ler.nextFloat();
      num3 = ler.nextFloat();
      media = (float)(((num1*2)+(num2*3)+(num3*5))/10);
      System.out.printf("%.1f%n",media);
    }
    ler.close();
  }
}