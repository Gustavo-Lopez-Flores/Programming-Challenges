import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, num;
    num = ler.nextInt();
    for(i=1;i<=num;i++){
      if(num%i==0){
        System.out.println(i);
      }
    }
    ler.close();
  }
}