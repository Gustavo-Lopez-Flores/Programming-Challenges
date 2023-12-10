import java.util.*;

public class Main {
  public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int[] fat = new int[5];
      fat[0] = 1;
      fat[1] = 2;
      fat[2] = 6;
      fat[3] = 24;
      fat[4] = 120;
    
      StringBuilder sb = new StringBuilder();
      sb.append("");
    
      while(ler.hasNext()){
        String numero = ler.next();
        
        if(numero.equals("0")){
          break;
        }

        int resultado = 0;
        char[] numeros = numero.toCharArray();
        for(int i = 0; i < numeros.length; i++){
          resultado += Character.getNumericValue(numeros[i]) * fat[numeros.length-i-1];
        } 
        
        sb.append(String.format("%d%n", resultado));
      }

      System.out.print(sb.toString());
      ler.close();
  }  
}