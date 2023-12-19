import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    int numLinhas = ler.nextInt();
    ler.nextLine();

    String[] linhas = new String[numLinhas];
    for(int i = 0; i < numLinhas; i++){
      linhas[i] = ler.nextLine();      
    }

    StringBuilder sb = new StringBuilder();
    String regex = ".{1}oulupukk.{1}";
    for(int i = 0; i < numLinhas; i++){
      sb.append(linhas[i].replaceAll(regex, "Joulupukki")).append("\n");
    }

    System.out.print(sb.toString());

    ler.close();
  }
}
