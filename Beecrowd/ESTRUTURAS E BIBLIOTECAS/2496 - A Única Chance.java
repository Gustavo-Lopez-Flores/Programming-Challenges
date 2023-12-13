import java.util.*;

public class Main {
  static boolean naoHaChances(String linha, int tamArr) {
    char[] arr = linha.trim().toCharArray();
    int trocas = 0;
    for(int i = 0; i < tamArr-1; i++){
      int menor = 123;
      int indice = -1;
      for(int j = i + 1; j < tamArr; j++){
        int num = Character.valueOf(arr[i]).compareTo(arr[j]);
        if(num > 0){
          if(arr[j] < menor){
            menor = (int) arr[j];
            indice = j;
          } 
        }
      }
      
      if(indice != -1){
        char aux = arr[i];
        arr[i] = arr[indice];
        arr[indice] = aux;
        trocas++;
        if(trocas > 1){
          return true;
        }
      }
    }
    
    return false;
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int casos = ler.nextInt();
    for(int i = 0; i < casos; i++){
      int tamArr = ler.nextInt();
      String linha = ler.next();
      
      if(naoHaChances(linha, tamArr)){
        System.out.println("There aren't the chance.");
      }else{
        System.out.println("There are the chance.");
      }
    }
    
    ler.close();
  }
}