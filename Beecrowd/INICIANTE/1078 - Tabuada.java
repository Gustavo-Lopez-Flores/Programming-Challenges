import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i, num;
    num = ler.nextInt();
    for(i=1;i<=10;i++){
      System.out.printf("%d x %d = %d%n",i,num,(i*num));
    }
    ler.close();
  }
}