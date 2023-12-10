import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
      int i = 1, num;
      num = ler.nextInt();
      while(i<=6){
        if(num % 2 == 0){
        }else{
          System.out.println(num);
          i++;
        }
        num++;
      }
    ler.close();
  }
}