import java.io.*;
import java.util.*;
import java.math.*;

public class cringe {
  private static final Map<Character, Character> map = new HashMap<>();

  static{
    map.put('a', '@');
    map.put('e', '&');
    map.put('i', '!');
    map.put('o', '*');
    map.put('u', '%');
    map.put('A', '@');
    map.put('E', '&');
    map.put('I', '!');
    map.put('O', '*');
    map.put('U', '%');
  }

  public static String encrypt(String line){
    StringBuilder sb = new StringBuilder();

    for(char c : line.toCharArray())
      sb.append(map.getOrDefault(c, c));

    return sb.append("\n").toString();
  }
  
  public static void main(String[] args) throws IOException{
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
      int cases = Integer.parseInt(br.readLine());
      String lines[] = new String[cases];
      
      for(int i = 0; i < cases; i++)
        lines[i] = br.readLine();

      StringBuilder result = new StringBuilder();
      for(String line : lines)
        result.append(encrypt(line));

      if(!result.isEmpty())
        System.out.print(result.toString());
    }
  }
}