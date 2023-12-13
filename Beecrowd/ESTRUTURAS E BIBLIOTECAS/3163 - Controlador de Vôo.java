import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    // -4 leste
    // -3 norte
    // -2 sul
    // -1 oeste
    
    int modo = 0; // 0 Norte, 1 Sul, 2 Leste, 3 Oeste
    ArrayDeque<String> norte = new ArrayDeque<>();
    ArrayDeque<String> sul = new ArrayDeque<>();
    ArrayDeque<String> leste = new ArrayDeque<>();
    ArrayDeque<String> oeste = new ArrayDeque<>();
    while(true){
      String texto = ler.next();
      if(texto.equals("0")){
        break;
      }else if(texto.contains("A")){
        switch(modo){
          case 1 -> oeste.add(texto);
          case 2 -> sul.add(texto);
          case 3 -> norte.add(texto);
          case 4 -> leste.add(texto);
          default -> modo = 0;
        }
      }else{
        switch(texto){
          case "-1" -> modo = 1;
          case "-2" -> modo = 2;
          case "-3" -> modo = 3;
          case "-4" -> modo = 4;
          default -> modo = 0;
        }
      }
    }

    StringBuilder resultado = new StringBuilder();
    resultado.append("");
    while(true){
      if(leste.isEmpty() && oeste.isEmpty() && norte.isEmpty() && sul.isEmpty())
        break;
      else{
        if(!oeste.isEmpty())
          resultado.append(oeste.poll()).append(" ");
        if(!norte.isEmpty())
          resultado.append(norte.poll()).append(" ");
        if(!sul.isEmpty())
          resultado.append(sul.poll()).append(" ");
        if(!leste.isEmpty())
          resultado.append(leste.poll()).append(" ");
      }
    }
    System.out.println(resultado.toString().trim());
    
    ler.close();
  }
}