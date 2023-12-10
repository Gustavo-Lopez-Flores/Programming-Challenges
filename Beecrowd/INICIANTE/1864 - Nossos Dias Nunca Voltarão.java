import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = ler.nextInt();
    ler.nextLine();
    String t = "LIFE IS NOT A PROBLEM TO BE SOLVED";
    for(int i = 0; i < n; i++){
      if(i == n - 1){
        System.out.println(t.charAt(i)); 
      }else{
        System.out.print(t.charAt(i)); 
      }
    }
    ler.close();
  }
}