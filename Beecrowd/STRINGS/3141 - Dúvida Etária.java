import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    String nome = ler.nextLine();
    String dataAtual = ler.nextLine();
    String dataNasc = ler.nextLine();

    String[] atual = dataAtual.split("/"); 
    int diaAtual = Integer.parseInt(atual[0]);
    int mesAtual = Integer.parseInt(atual[1]);
    int anoAtual = Integer.parseInt(atual[2]);
    
    String[] nasc = dataNasc.split("/"); 
    int diaNasc = Integer.parseInt(nasc[0]);
    int mesNasc = Integer.parseInt(nasc[1]);
    int anoNasc = Integer.parseInt(nasc[2]);

    if(diaNasc == diaAtual && mesNasc == mesAtual){
      System.out.println("Feliz aniversario!");
    }    

    int idade = Math.abs(anoAtual - anoNasc);
    boolean decrementa = (mesNasc > mesAtual) || (mesNasc == mesAtual && diaNasc > diaAtual);
    
    if(decrementa){
      idade--;
    }

    System.out.println(String.format("Voce tem %d anos %s.", idade, nome));
    
    ler.close();
  }
}
