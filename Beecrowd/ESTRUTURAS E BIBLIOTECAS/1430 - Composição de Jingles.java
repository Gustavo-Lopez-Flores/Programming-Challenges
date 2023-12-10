import java.util.Scanner;
import java.lang.*;

public class Main {
  public static void contarCompassos(String jingle){
    int corretos = 0;
    double compasso;
    String[] compassos = jingle.split("/");

    for(int i = 0; i < compassos.length; i++){
      compasso = 0.0;
      
      for(int j = 0; j < compassos[i].length(); j++){
        char nota = compassos[i].charAt(j);
        switch (nota){
          case 'W':
            compasso += (double)1;
          break;
          case 'H':
            compasso += (double)1/2;
          break;
          case 'Q':
            compasso += (double)1/4;
          break;
          case 'E':
            compasso += (double)1/8;
          break;
          case 'S':
            compasso += (double)1/16;
          break;
          case 'T':
            compasso += (double)1/32;
          break;
          case 'X':
            compasso += (double)1/64;
          break;
          default:           
        }
      }

      if(compasso == 1){
        corretos++;
      }
    }

    System.out.println(corretos);
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    while(input.hasNextLine()){
      String jingle = input.nextLine();

      if(jingle.equals("*")){
        break;
      }else{
        contarCompassos(jingle);
      }
    }
    
    input.close();
  }
}