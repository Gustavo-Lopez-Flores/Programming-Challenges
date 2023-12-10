import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i, num;
    num = ler.nextInt();
    for(i=1; i<=num; i++){
    if(i%2==0){
      System.out.printf("%d^2 = %d%n",i,(i*i));
    }
    }
    ler.close();
  }
}