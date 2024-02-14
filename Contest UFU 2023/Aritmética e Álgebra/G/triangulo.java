import java.io.*;
import java.util.*;
import java.math.*;
  
public class triangulo {
  public static boolean ehTriangulo(int xa, int ya, int xb, int yb, int xc, int yc){
    boolean colinear = (ya == yb && yb == yc) || 
                       (xa == xb && xb == xc);

    if(colinear)
      return false;

    int mab = Math.abs(yb-ya);
    if(Math.abs(xb-xa) != 0)
      mab /= Math.abs(xb-xa);
    
    int mbc = Math.abs(yc-yb);
    if(Math.abs(xc-xb) != 0)
      mbc /= Math.abs(xc-xb);

    if(mab == mbc)
      return false;
        
    int distQuadradaAB = (xa - xb) * (xa - xb) + (ya - yb) * (ya - yb);
    int distQuadradaBC = (xb - xc) * (xb - xc) + (yb - yc) * (yb - yc);
    int distQuadradaAC = (xa - xc) * (xa - xc) + (ya - yc) * (ya - yc);

    if (distQuadradaAB == distQuadradaBC + distQuadradaAC ||
      distQuadradaBC == distQuadradaAB + distQuadradaAC ||
      distQuadradaAC == distQuadradaAB + distQuadradaBC) {
      return true;
    }

    return false;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    int cases = Integer.parseInt(br.readLine());
    for (int i = 0; i < cases; i++){
      int[] dados = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
      if(ehTriangulo(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5])){
        sb.append("sim\n");    
      }else{
        sb.append("nao\n");    
      }
    }

    System.out.print(sb.toString());
  }
}