import java.util.Scanner;

public class Main {
  static int contarCiclos(String rastro, int processos){
    int numCiclos = 0, sequencia = 0;

    for(char letra : rastro.toCharArray()){
      if(letra == 'R'){
        sequencia++;        
        if(sequencia == processos){
          sequencia = 0;
          numCiclos++;
        }
      }else{
        if(sequencia > 0){
          numCiclos += 2;
        }else{
          numCiclos++;        
        }
        sequencia = 0;
      }
    }

    if(sequencia > 0){
      numCiclos++;
    }
    
    return numCiclos;
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    while(ler.hasNext()){
      String rastro = ler.next();
      int processos = ler.nextInt();
      System.out.println(contarCiclos(rastro, processos));
    }
  
    ler.close();
  }
}