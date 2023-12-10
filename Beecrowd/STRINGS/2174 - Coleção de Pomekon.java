import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
      Map<String, Boolean> pomekons = new HashMap<>();
    
    int casos = ler.nextInt();
    
    for(int i = 0; i < casos; i++){
      String pomekon = ler.next();

      if(!pomekons.containsKey(pomekon)){
        pomekons.put(pomekon, true);
      }
    }

    System.out.printf("Falta(m) %d pomekon(s).%n", (151 - pomekons.size()));
    ler.close();
  }
}
