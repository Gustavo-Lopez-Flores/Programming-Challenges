import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      String linha;
      linha = ler.nextLine();
      if(linha.contains("13")){
        System.out.printf(linha + " es de Mala Suerte%n");
      }else{
        System.out.printf(linha + " NO es de Mala Suerte%n");
      }
      ler.close();
  }
}
