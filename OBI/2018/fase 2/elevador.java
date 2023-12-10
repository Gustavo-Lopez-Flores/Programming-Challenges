import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int quantia = ler.nextInt();
    List<Integer> vetor = new ArrayList<>();
    
    for(int i = 0; i < quantia; i++){
      int numero = ler.nextInt();
      vetor.add(numero);
    }

    Collections.sort(vetor);
    boolean condicao = false;
    int limite = vetor.size() - 1;
    for(int i = 0; i < limite; i++){
      int diferenca = Math.abs(vetor.get(i) - vetor.get(i+1));
      
      if(diferenca > 8){
        condicao = true;
        break;
      }
    }

    if(vetor.get(0) > 8){
      condicao = true;
    }
    
    if(condicao){
      System.out.println("N");
    }else{
      System.out.println("S");
    }
    
    ler.close();
  }
}