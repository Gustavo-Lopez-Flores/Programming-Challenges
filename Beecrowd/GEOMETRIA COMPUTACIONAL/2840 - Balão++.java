import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    int raio = ler.nextInt();
    double litros = ler.nextDouble();
    double volume = (4.0/3.0) * (3.1415 * Math.pow(raio, 3.0));

    int qtd = 0;
    while(true){
      if(litros >= volume){
        litros = litros - volume;
        qtd++;
      }else{
        break;
      }
    }
    
    System.out.println(qtd);
    ler.close();
  }
}
