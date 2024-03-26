import java.io.*;
import java.util.*;
import java.math.*;
import java.util.stream.*;

public class grid {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> grid = Arrays.stream(br.readLine().split("\\s+"))
    .map(Integer::parseInt)
    .collect(Collectors.toList());

    StringBuilder gridCrescente = new StringBuilder();
    Collections.sort(grid);
    for(int n : grid){
      gridCrescente.append(n).append(" ");
    }
    System.out.println(gridCrescente.toString().trim());
    
    StringBuilder gridDecrescente = new StringBuilder();
    Collections.sort(grid, Collections.reverseOrder());
    for(int n : grid){
      gridDecrescente.append(n).append(" ");
    }
    System.out.println(gridDecrescente.toString().trim());
    
    br.close();
  }
}