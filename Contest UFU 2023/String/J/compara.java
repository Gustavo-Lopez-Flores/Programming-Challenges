import java.util.*;

public class compara {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String a = sc.next();
    String b = sc.next();
    if(a.equals(b))
      System.out.println("1");
    else
      System.out.println("0");

    sc.close();
  }  
}