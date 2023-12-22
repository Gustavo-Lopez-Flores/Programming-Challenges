import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;
import java.util.Queue;

public class Main {
  static class Coordenada{
    int x, y;

    Coordenada(int x, int y){
      this.x = x;
      this.y = y;
    }
  }
  public static void encontrarCoordenada(int casos, Scanner ler){
    int divX = ler.nextInt(), divY = ler.nextInt();

    Deque<Coordenada> cd = new LinkedList<>();

    for(int i = 0; i < casos; i++){
      cd.offer(new Coordenada(ler.nextInt(), ler.nextInt()));
    }

    StringBuilder sb = new StringBuilder();
    for(Coordenada c : cd){
      if(c.x == divX || c.y == divY){
        sb.append("divisa\n");
      }else if(c.x < divX && c.y < divY){
        sb.append("SO\n");
      }else if(c.x > divX && c.y < divY){
        sb.append("SE\n");
      }else if(c.x < divX && c.y > divY){
        sb.append("NO\n");
      }else if(c.x > divX && c.y > divY){
        sb.append("NE\n");
      }
    }
    System.out.print(sb.toString());
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNextInt()){
      int casos = ler.nextInt();
      
      if(casos == 0){
        break;
      }else{
        encontrarCoordenada(casos, ler);
      }
    }
    
  }
}