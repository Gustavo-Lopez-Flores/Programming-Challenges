import java.util.Scanner;

public class compressao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    StringBuilder sb = new StringBuilder();
    String linha = sc.nextLine();
    if(linha.length() > 0){
      char cAtual = linha.charAt(0);
      char cAnterior = cAtual;
      int contador = 1;
      for(int i = 1; i < linha.length(); i++){
        if(linha.charAt(i) == cAnterior){
          contador++;
        } else {
          if(contador > 2){
            sb.append(cAnterior).append(contador);
          }else{
            sb.append(Character.toString(cAnterior).repeat(contador));
          }

          cAnterior = linha.charAt(i);
          contador = 1;
        }
        
        if(i == linha.length() - 1){
          if(contador > 2){
            sb.append(cAnterior).append(contador);
          }else{
            sb.append(Character.toString(cAnterior).repeat(contador));
          }
        }
      }
    }
    System.out.println(sb.toString());
    
    
    sc.close();
  }
}
