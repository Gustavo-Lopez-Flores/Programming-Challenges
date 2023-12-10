import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int j, num1, num2;
    num1 = ler.nextInt();
    num2 = ler.nextInt();
    for(j = 1; j <= num2; j++){
      if(j%num1 == 0){
        System.out.println(j);      
      }else{
        System.out.printf("%d ",j);
      }
    }
    ler.close();
  }
}