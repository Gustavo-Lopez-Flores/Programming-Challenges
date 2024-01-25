import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class contavogal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String linha = sc.nextLine();
    Pattern pattern = Pattern.compile("[aeiouAEIOU]");
    Matcher matcher = pattern.matcher(linha);
    
    int contador = 0;
    while (matcher.find()) {
      contador++;
    }

    System.out.println(contador);
    sc.close();
  }
}
