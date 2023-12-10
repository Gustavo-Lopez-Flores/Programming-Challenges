import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i, num, qntd;
    qntd = ler.nextInt();
    for(i=1;i<=qntd;i++){
      num = ler.nextInt();
      if(num==0){
        System.out.println("NULL");
      }else if (num%2==0){
        if(num>0){
          System.out.println("EVEN POSITIVE");
        }else if(num<0){
          System.out.println("EVEN NEGATIVE");
        }
      }else{
        if(num>0){
          System.out.println("ODD POSITIVE");
        }else if(num<0){
          System.out.println("ODD NEGATIVE");
        }
      }
    }
    ler.close();
  }
}