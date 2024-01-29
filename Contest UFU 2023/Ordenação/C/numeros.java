import java.io.*;
import java.util.*;
import java.util.stream.*;  

public class numeros {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int qtd = Integer.parseInt(bf.readLine().trim());
    String[] nums = bf.readLine().trim().split(" ");
    List<Integer> list = Arrays.stream(nums).map(Integer::parseInt).collect(Collectors.toList());

    Collections.sort(list);

    List<String> result = list.stream().map(String::valueOf).collect(Collectors.toList());
    System.out.println(String.join(" ", result));
    
    bf.close();
  }
}