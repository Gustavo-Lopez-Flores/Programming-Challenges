import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String p1 = new String();
    String p2 = new String();
    String p3 = new String();
    int n1, n2, n3;
    p1 = ler.nextLine();
    n1 = p1.length();
    p2 = ler.nextLine();
    n2 = p2.length();
    if (n1 == 10) {
      if (n2 == 3) {
        p3 = ler.nextLine();
        n3 = p3.length();
        if(n3 == 9){
          System.out.println("aguia");
        }else{
          System.out.println("pomba");
        }
      } else {
        p3 = ler.nextLine();
        n3 = p3.length();
        if(n3 == 7){
          System.out.println("homem");
        }else{
          System.out.println("vaca");
        }  
      }
    } else {
      if (n2 == 6) {
        p3 = ler.nextLine();
        n3 = p3.length();
        if(n3 == 10){
          System.out.println("pulga");
        }else{
          System.out.println("lagarta");
        }
      } else {
        p3 = ler.nextLine();
        n3 = p3.length();
        if(n3 == 10){
          System.out.println("sanguessuga");
        }else{
          System.out.println("minhoca");
        }
      }
    }
  ler.close();
  }
}