import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    ArrayList<Integer> feynman = new ArrayList<Integer>();
    feynman.add(1);
    feynman.add(5);
    
    while(ler.hasNext()){
      int n = ler.nextInt();
      if(n == 0){
        break;
      }else if(n < feynman.size()){
        System.out.println(feynman.get(n-1));
      }else{
        for(int i = feynman.size(); i < n; i++){
          int novo = ((i+1)*(i+1)) + feynman.get(i-1);
          feynman.add(novo);
        }

        System.out.println(feynman.get(n-1));
      }  
    }
    
    ler.close();
  }
}