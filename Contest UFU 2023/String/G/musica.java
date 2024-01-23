import java.util.Scanner;

public class musica {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int quantidadePalavras = sc.nextInt();
    sc.nextLine();
    
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < quantidadePalavras; i++){
      sb.append(sc.nextLine()).append(" ");
    }
    System.out.println(sb.toString().trim());
      
    sc.close();
  }
}
