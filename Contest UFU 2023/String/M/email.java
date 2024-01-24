import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class email {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] partes = sc.nextLine().split("@");
    if(partes.length == 2){
      Pattern patternUm = Pattern.compile("^[a-zA-Z0-9\\.]+$");
      Matcher matcherUm = patternUm.matcher(partes[0]);
      Pattern patternDois = Pattern.compile("^[a-z\\.]+$");
      Matcher matcherDois = patternUm.matcher(partes[1]);
      if(matcherUm.matches() 
         && matcherDois.matches() 
         && (partes[1].charAt(partes[1].length() - 1) != '.')){
        System.out.println("1");
      }else{
        System.out.println("0");
      }
    }else{
      System.out.println("0");
    }
      
    sc.close();
  }
}
