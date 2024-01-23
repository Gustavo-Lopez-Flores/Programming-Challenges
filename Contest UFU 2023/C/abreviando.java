import java.util.Scanner;

public class abreviando {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] nome = sc.nextLine().split(" ");
    if(nome.length <= 2){
      String resultado = String.join(" ", nome);
      System.out.println(resultado);
    }else{
      StringBuilder sb = new StringBuilder();
      sb.append(nome[0]).append(" ");
      for(int i = 1; i < nome.length - 1; i++){
        if(!(nome[i].equals("da") || nome[i].equals("de") || nome[i].equals("do") || nome[i].equals("dos") || nome[i].equals("e"))){
          sb.append(nome[i].charAt(0) + ".").append(" ");
        }
      }
      sb.append(nome[nome.length - 1]);
      System.out.println(sb.toString());
    }

    
    sc.close();
  }
}
