import java.util.*;

public class criptografia {
  static String criptografa(String linha){
    StringBuilder sb = new StringBuilder(linha);
    sb.reverse();

    int metade = linha.length() % 2 == 0 ? (linha.length() / 2): (int)(linha.length() / 2) + 1;

    StringBuilder criptografia = new StringBuilder();
    criptografia.append(sb.toString().substring(metade));
    criptografia.append(sb.toString().substring(0, metade));

    return criptografia.toString();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int casos = sc.nextInt();
    sc.nextLine();

    String[] linhas = new String[casos];
    for(int i = 0; i < casos; i++){
      linhas[i] = sc.nextLine();
    }

    StringBuilder resultado = new StringBuilder();
    for(String linha : linhas){
      resultado.append(criptografa(linha)).append("\n");
    }
    System.out.println(resultado);

    sc.close();
  }
}
