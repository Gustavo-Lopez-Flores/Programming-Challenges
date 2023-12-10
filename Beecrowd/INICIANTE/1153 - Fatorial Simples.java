import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num, i, fat = 1;
    num = ler.nextInt();
    for(i = 1; i <= num; i++){
      fat = fat * i;
    }  
    System.out.println(fat);
    ler.close();
  }
}