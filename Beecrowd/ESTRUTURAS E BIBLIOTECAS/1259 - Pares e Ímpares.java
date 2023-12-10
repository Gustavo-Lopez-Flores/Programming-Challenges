import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    List<Integer> pares = new ArrayList<>();
    List<Integer> impares = new ArrayList<>();
    int quantidade = ler.nextInt();

    for(int i = 0; i < quantidade; i++){
      int numero = ler.nextInt();

      if(numero % 2 == 0){
        pares.add(numero);
      }else{
        impares.add(numero);
      }
   }
    
    Collections.sort(pares);
    Collections.sort(impares, Collections.reverseOrder());
    
    for(int num : pares){
      System.out.println(num);
    }

    for(int num : impares){
      System.out.println(num);
    }
    
    ler.close();
  }
}