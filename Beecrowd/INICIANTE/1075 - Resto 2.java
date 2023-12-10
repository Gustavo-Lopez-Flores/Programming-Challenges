import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i, num;
    num = ler.nextInt();
    for(i=1;i<=10000;i++){
      if(i%num==2){
        System.out.println(i);
      }
    }
    ler.close();
  }
}