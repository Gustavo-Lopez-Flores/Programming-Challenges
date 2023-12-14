import java.util.*;

public class Main {
  static void leituraOtica(int[][] questoes, int casos){
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < casos; i++){
      int marcou = 0;
      int indice = 0;

      for(int j = 0; j < 5; j++){
        if(questoes[i][j] <= 127){
          marcou++;
          indice = j;    
        }
      }

      if(marcou == 1){
        switch(indice){
          case 0 -> sb.append("A").append("\n");
          case 1 -> sb.append("B").append("\n");           
          case 2 -> sb.append("C").append("\n");           
          case 3 -> sb.append("D").append("\n");           
          case 4 -> sb.append("E").append("\n");           
        }
      }else{
        sb.append("*").append("\n");
      }
    }

    System.out.print(sb.toString());
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(true){
      int casos = ler.nextInt();
      
      if(casos == 0) 
        break;
      
      int[][] questoes = new int[casos][5];
      for(int i = 0; i < casos; i++){
        for(int j = 0; j < 5; j++){
          questoes[i][j] = ler.nextInt();
        }
      }

      leituraOtica(questoes, casos);
    }

    ler.close();
  }
}