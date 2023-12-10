import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void restanteDieta(String dieta, String oqAlmocou, String oqJantou){
    if(dieta.length() == 0){
      if(oqAlmocou.length() == 0 && oqJantou.length() == 0){
        System.out.println();
      }else{
        System.out.println("CHEATER");
      }
    }else{
      // restoDieta - (oqAlmocou + oqJantou)
      StringBuilder restoDieta = new StringBuilder(dieta);
      boolean diferente = false;
        
      for (char alimento : (oqAlmocou + oqJantou).toCharArray()) {
        int index = restoDieta.indexOf(String.valueOf(alimento));
        if (index != -1) {
          restoDieta.deleteCharAt(index);
        }else{
          diferente = true;
          break;
        }
      }

      // Ordenar
      if(diferente){
        System.out.println("CHEATER");
      }else{
        if (restoDieta.length() == 0) {
          System.out.println();
        } else {
          char[] caracteres = restoDieta.toString().toCharArray();
          Arrays.sort(caracteres);
          String textoOrdenado = new String(caracteres);
          
          StringBuilder builder = new StringBuilder();
          for (int i = 0; i < textoOrdenado.length(); i++) {
            char atual = textoOrdenado.charAt(i);
            if (builder.indexOf(String.valueOf(atual)) == -1) {
              builder.append(atual);
            }
          }
          System.out.println(builder);        
        }
      }
    }
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = ler.nextInt();
    ler.nextLine();
    
    for(int i = 0; i < n; i++){
      String dieta = ler.nextLine();
      String almoco = ler.nextLine();      
      String janta = ler.nextLine();    
      restanteDieta(dieta, almoco, janta);
    }

    ler.close();
  }
}