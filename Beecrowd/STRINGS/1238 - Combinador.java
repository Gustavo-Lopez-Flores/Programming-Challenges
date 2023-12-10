import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = ler.nextInt();

    for(int i = 0; i < n; i++){
      String primeiraString = ler.next();
      String segundaString = ler.next();
      StringBuilder novaString = new StringBuilder();
      int tamPrimeiraString = primeiraString.length(), tamSegundaString = segundaString.length();
      for(int j = 0, k = 0, cont = 0; j < tamPrimeiraString || k < tamSegundaString; cont++){
        if(cont % 2 == 0){
          if(j < tamPrimeiraString){
            novaString.append(Character.toString(primeiraString.charAt(j)));
            j++; 
          }
        }else{
          if(k < tamSegundaString){
            novaString.append(Character.toString(segundaString.charAt(k)));
            k++;
          }
        }
      }
      System.out.println(novaString);
    }
    
    ler.close();
  }
}