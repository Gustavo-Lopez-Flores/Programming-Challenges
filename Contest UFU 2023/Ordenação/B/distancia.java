import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;  

public class Main{
  static class Coordenada implements Comparable<Coordenada>{
    int x, y;
    double distancia;
    
    Coordenada(int x, int y){
      this.x = x;
      this.y = y;
      this.distancia = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    @Override
    public int compareTo(Coordenada o){
      return Double.compare(this.distancia, o.distancia);
    }

    @Override
    public String toString() {
      return this.x + " " + this.y;
    }
  }
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int qtd = Integer.parseInt(bf.readLine().trim());
    List<Coordenada> list = new ArrayList<>();
    
    IntStream.range(0, qtd).forEach(qItr -> {
      try{
        String[] nums = bf.readLine().trim().split("\\s+");
        list.add(new Coordenada(Integer.parseInt(nums[0]), Integer.parseInt(nums[1])));
      }catch(IOException e){
        throw new RuntimeException(e);
      }
    });

    Collections.sort(list);

    list.forEach(System.out::println);
    
    bf.close();
  }
}