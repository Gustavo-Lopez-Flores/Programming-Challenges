import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int num, i;
    num = ler.nextInt();
    for(i = 1; i <= num; i++){
      if(i % 2 ==0){}
      else{
        System.out.println(i);        
      }
    }
    ler.close();
  }
}