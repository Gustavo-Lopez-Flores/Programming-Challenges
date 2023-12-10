import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    List<Integer> listaV = new ArrayList<>();
    List<Integer> listaD = new ArrayList<>();
    int n = ler.nextInt();
    int m = ler.nextInt();
    String[][] matriz = new String[n][m];

    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        matriz[i][j] = ler.next();
      }
    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        int tamMatriz = matriz[i][j].length() - 1;
        int parteNumerica = Integer.parseInt(matriz[i][j].substring(0, tamMatriz));
        if(matriz[i][j].contains("V")){
          listaV.add(parteNumerica);
        }else{
          listaD.add(parteNumerica);
        }
      }
    }

    Collections.sort(listaV, Collections.reverseOrder());
    Collections.sort(listaD, Collections.reverseOrder());

    StringBuilder sb = new StringBuilder();
    sb.append("");

    for(int i : listaV){
      sb.append(String.format(i + "V%n"));
    }

    for(int i : listaD){
      sb.append(String.format(i + "D%n"));
    }

    System.out.print(sb.toString());

    ler.close();
  }
}
