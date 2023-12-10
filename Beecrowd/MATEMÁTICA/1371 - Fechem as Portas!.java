import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while (ler.hasNext()) {
      int numero = ler.nextInt();

      if(numero == 0){
        break;
      }else{
        int raizQuadrada = (int) Math.sqrt(numero);

        StringBuilder resultado = new StringBuilder();
        resultado.append("");
        for(int i = 1; i <= raizQuadrada; i++){
          int valor = i * i;
          
          if(i != raizQuadrada){
            resultado.append(Integer.toString(valor) + " "); 
          }else{
            resultado.append(Integer.toString(valor));
          }
        }

        System.out.println(resultado.toString());
      }
    }

    ler.close();
  }
}