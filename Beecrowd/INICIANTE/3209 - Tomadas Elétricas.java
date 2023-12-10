import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int numCasos = ler.nextInt();
    for(int i = 0; i < numCasos; i++){
      int numFiltros = ler.nextInt();
      int totalTomadas = 0;
      
      for(int j = 0; j < numFiltros; j++){
        int numRegua = ler.nextInt();
        totalTomadas += numRegua;
      }

      System.out.println(totalTomadas - (numFiltros-1));
    }

    ler.close();
  }
}