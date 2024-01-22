import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class brincos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int casos = sc.nextInt();
    Map<Integer, Map<Character, Integer>> mapaPrincipal = new HashMap<>();
    for (int i = 0; i < casos; i++){
      int n = sc.nextInt();
      char c = sc.next().charAt(0);
      if(mapaPrincipal.containsKey(n)){
        Map<Character, Integer> mapaInterno = mapaPrincipal.get(n);
        mapaInterno.put(c, mapaInterno.getOrDefault(c, 0) + 1);
      }else{
        mapaPrincipal.put(n, new HashMap<Character, Integer>(){{put(c, 1);}});
      }
    }

    int pares = 0;
    for(Map<Character, Integer> mI : mapaPrincipal.values()){
      pares += (int)((mI.getOrDefault('E', 0) + mI.getOrDefault('D', 0)) / 2);
    }

    System.out.println(pares);
    sc.close();
  }
}