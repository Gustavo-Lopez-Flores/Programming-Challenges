import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
  
    int casosDeTeste = ler.nextInt();
    ler.nextLine();
   
    String[] textos = new String[casosDeTeste];
    String[] palavrasBuscadas = new String[casosDeTeste];
  
    for(int i = 0; i < casosDeTeste; i++){
      textos[i] = ler.nextLine();
      palavrasBuscadas[i] = ler.nextLine();
    }
  
    for (int i = 0; i < casosDeTeste; i++) {
      StringBuilder ocorrencias = new StringBuilder();

      String regex = "\\b" + Pattern.quote(palavrasBuscadas[i]) + "\\b";
      Pattern pattern = Pattern.compile(regex);

      Matcher matcher = pattern.matcher(textos[i]);

      while (matcher.find()) {
        int indiceInicio = matcher.start();
        ocorrencias.append(indiceInicio).append(" ");
      }

      if (ocorrencias.length() > 0) {
        System.out.println(ocorrencias.toString().trim());
      } else {
        System.out.println("-1");
      }
    }

    ler.close();
  }
}