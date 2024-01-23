import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class belisa {
  public static boolean anagrama(String primeira, String segunda) {
    if (primeira.length() != segunda.length()) {
      return false;
    }

    Map<Character, Integer> charCount = new HashMap<>();

    for (char c : primeira.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }

    for (char c : segunda.toCharArray()) {
      if (!charCount.containsKey(c)) {
        return false;
      }
      charCount.put(c, charCount.get(c) - 1);
      if (charCount.get(c) == 0) {
        charCount.remove(c);
      }
    }

    return charCount.isEmpty();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String primeira = sc.nextLine();
    String segunda = sc.nextLine();

    if (anagrama(primeira, segunda)) {
      System.out.println("sim");
    } else {
      System.out.println("nao");
    }

    sc.close();
  }
}
