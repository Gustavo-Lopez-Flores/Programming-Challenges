import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int casos = ler.nextInt();
    for(int i = 0; i < casos; i++){
      int gols = ler.nextInt();
      int[] vetMarcou = new int[3];
      Arrays.fill(vetMarcou, 0);
      
      for(int j = 0; j < gols; j++){
        Character marcou = ler.next().charAt(0);
        Character sofreu = ler.next().charAt(0);
        
        switch (marcou){
          case 'R': 
            vetMarcou[0] = sofreu == 'B' ? vetMarcou[0]+1 : vetMarcou[0]+2; 
          break;
          case 'G': 
            vetMarcou[1] = sofreu == 'R' ? vetMarcou[1]+1 : vetMarcou[1]+2;  
          break;
          case 'B': 
            vetMarcou[2] = sofreu == 'G' ? vetMarcou[2]+1 : vetMarcou[2]+2; 
          break;
        }
      }

      
      if(vetMarcou[0] == vetMarcou[1] && vetMarcou[1] == vetMarcou[2]){
        System.out.println("trempate");  
      }else{
        if(vetMarcou[0] > vetMarcou[1] && vetMarcou[0] > vetMarcou[2]){
          System.out.println("red");  
        }else if(vetMarcou[1] > vetMarcou[0] && vetMarcou[1] > vetMarcou[2]){
          System.out.println("green");  
        }else if(vetMarcou[2] > vetMarcou[0] && vetMarcou[2] > vetMarcou[1]){
          System.out.println("blue");  
        }else{
          System.out.println("empate");  
        }
      }
    }

    ler.close();
  }
}
