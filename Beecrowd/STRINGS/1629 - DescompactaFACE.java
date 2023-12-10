import java.util.Scanner;

public class Main {
  public static void descompactaFACE(String numero){
    int tamNumero = numero.length();
    int qtdZero = 0, qtdUm = 0;
    
    for(int i = 0; i < tamNumero; i++){
      int digito = Character.getNumericValue(numero.charAt(i));
      if(i % 2 == 0){
        qtdUm+=digito;
      }else{
        qtdZero+=digito;
      }
    }

    String zero = Integer.toString(qtdZero);
    String um = Integer.toString(qtdUm);
    int numeroDescompactado = 0;

    for(int i = 0; i < zero.length(); i++){
      numeroDescompactado += Character.getNumericValue(zero.charAt(i));  
    }

    for(int i = 0; i < um.length(); i++){
      numeroDescompactado += Character.getNumericValue(um.charAt(i));  
    }

    System.out.println(numeroDescompactado);
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    while(ler.hasNext()){
      int entradas = ler.nextInt();

      if(entradas == 0){
        break;
      }else{
        for(int i = 0; i < entradas; i++){
          String numero = ler.next();
          descompactaFACE(numero);
        }         
      }

    }
  
    ler.close();
  }
}