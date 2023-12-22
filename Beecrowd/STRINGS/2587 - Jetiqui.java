import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    StringBuilder resultado = new StringBuilder();

    int casosTeste = ler.nextInt();
    ler.nextLine();
    for(int i = 0; i < casosTeste; i++){
      String primeira = ler.nextLine();
      String segunda = ler.nextLine();     
      String duvida = ler.nextLine();

      int indiceUm = duvida.indexOf("_");
      int indiceDois = duvida.lastIndexOf("_");
      char aPrimeira = primeira.charAt(indiceUm);
      char bPrimeira = primeira.charAt(indiceDois);
      char aSegunda = segunda.charAt(indiceUm);
      char bSegunda = segunda.charAt(indiceDois);

    boolean condicaoUm =  
    ((aPrimeira != bPrimeira) && (aSegunda == bSegunda) && ((aPrimeira == aSegunda || aPrimeira == bSegunda) || (bPrimeira == aSegunda || bPrimeira == bSegunda))) 
      || 
    ((aSegunda != bSegunda) && (aPrimeira == bPrimeira) && ((aSegunda == aPrimeira || aSegunda == bPrimeira) || (bSegunda == aPrimeira || bSegunda == bPrimeira))); 
    boolean condicaoDois = 
      ((aPrimeira != aSegunda && bPrimeira != bSegunda) && ((aPrimeira == aSegunda || aPrimeira == bSegunda) || (bPrimeira == aSegunda || bPrimeira == bSegunda)));
    boolean condicaoTres = (aPrimeira == aSegunda && bPrimeira == bSegunda);
    boolean condicaoQuatro = (aPrimeira == bPrimeira && aSegunda == bSegunda);
      if(condicaoUm || condicaoDois || condicaoTres || condicaoQuatro){
        resultado.append("Y\n");
      }else{
        resultado.append("N\n");
      }
    }

    System.out.print(resultado.toString());
    ler.close();
  }
}
