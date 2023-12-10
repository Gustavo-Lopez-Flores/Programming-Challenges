import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String linha = ler.nextLine();
    char[] vetor = linha.toCharArray();

    int abertas = 0;
    for(int i = 0; i < vetor.length; i++){
      if(vetor[i] == '('){
        abertas+=1;
      }else if(vetor[i] == ')' && abertas > 0){
        abertas-=1;
      }
    }

    if(abertas > 0){
      System.out.printf("Ainda temos %d assunto(s) pendente(s)!%n", abertas);
    } else{
     System.out.println("Partiu RU!");
    }

    ler.close();
  }
}