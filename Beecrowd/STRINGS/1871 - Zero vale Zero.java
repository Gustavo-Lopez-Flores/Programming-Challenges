import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNext()){
      String a = ler.next();
      String b = ler.next();

      if(a.equals("0") && b.equals("0")){
        break;
      }else{
        long soma = Long.parseLong(a) + Long.parseLong(b);
        String somaString = Long.toString(soma);
        StringBuilder somaSemZero = new StringBuilder();
  
        int tamSomaString = somaString.length();
        for(int i = 0; i < tamSomaString; i++){
           if(somaString.charAt(i) != '0'){
             somaSemZero.append(somaString.charAt(i));
           } 
        }
  
        System.out.println(somaSemZero);        
      }
    }
    
    ler.close();
  }
}
