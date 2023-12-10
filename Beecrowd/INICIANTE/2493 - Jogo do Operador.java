import java.util.*;

public class Main {
  static class Expressao{
    public int a, b, r;
    public String certo;

      public Expressao(int a, int b, int r){
      this.a = a;
      this.b = b;
      this.r = r;
      if(r == (a+b)){
        certo = "+";
      }else if(r == (a-b)){
        certo = "-";
      }else if(r == (a*b)){
        certo = "*";
      }else{
        certo = "I";
      }
    }

    public boolean sinalErrado(String sinal){
      if(sinal.equals(certo)){
        return false;
      }
      return true;
    }
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNextLine()){
      int t = ler.nextInt();
      ler.nextLine();
      
      String[] expressoes = new String[t];
      for (int i = 0; i < t; i++) {
        String linha = ler.nextLine();
        expressoes[i] = linha;
      }
  
      String[] pessoas = new String[t];
      for (int i = 0; i < t; i++) {
        String linha = ler.nextLine();
        pessoas[i] = linha;
      }
  
      List<Expressao> expressao = new ArrayList<>();
      for(int i = 0; i < t; i++){
        int indexEspaco = expressoes[i].indexOf(" ");
        int indexIgual = expressoes[i].indexOf("=");
        int tamanho = expressoes[i].length();
        int a = Integer.parseInt(expressoes[i].substring(0, indexEspaco).trim());
        int b = Integer.parseInt(expressoes[i].substring(indexEspaco + 1, indexIgual).trim());
        int r = Integer.parseInt(expressoes[i].substring(indexIgual + 1, tamanho).trim());
        expressao.add(new Expressao(a, b, r));
      }
  
      int qtdErradas = 0;
      Set<String> errou = new TreeSet<>();
      for(int i = 0; i < t; i++){
        String[] tentativa = pessoas[i].split("[ ]");
        int indice = Integer.parseInt(tentativa[1].trim()) - 1;
        if(expressao.get(indice).sinalErrado(tentativa[2])){
          errou.add(tentativa[0]);
          qtdErradas++;
        }
      }
      
      StringBuilder sb = new StringBuilder();
      if(qtdErradas == 0){
        sb.append("You Shall All Pass!");
      }else if(qtdErradas == t){
        sb.append("None Shall Pass!");
      }else{
        for(String s : errou){
          sb.append(s + " ");
        }
      }
      System.out.println(sb.toString().trim());
    }
    
    ler.close();
 }
}