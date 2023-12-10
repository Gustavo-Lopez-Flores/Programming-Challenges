import java.util.*;

public class Main {
  public static void abreviar(String linha) {
    List<String> palavras = new ArrayList<>();
    Map<Character, String> abreviacoes = new TreeMap<>();
    Map<Character, Integer> frequenciaPalavras = new HashMap<>();

    String[] divisoes = linha.split(" ");
    palavras.addAll(Arrays.asList(divisoes));
    
    for (String palavraAtual : divisoes) {
      char primeiraLetra = palavraAtual.charAt(0);

      if (palavraAtual.length() > 2) {
        if (!abreviacoes.containsKey(primeiraLetra)) {
          int frequencia = contarPalavras(palavras, palavraAtual);
          frequenciaPalavras.put(primeiraLetra, frequencia);
          
          abreviacoes.put(primeiraLetra, palavraAtual);
        } else {
          int frequenciaAntiga = frequenciaPalavras.get(primeiraLetra);
          int aproveitamentoAntiga = frequenciaAntiga * (abreviacoes.get(primeiraLetra).length() - 2);

          int frequenciaNova = contarPalavras(palavras, palavraAtual);
          int aproveitamentoNova = frequenciaNova * (palavraAtual.length() - 2);
          
          boolean aproveitamento = (aproveitamentoNova > aproveitamentoAntiga);
          
          if (aproveitamento) {
            abreviacoes.put(primeiraLetra, palavraAtual);
            frequenciaPalavras.put(primeiraLetra, frequenciaNova);
          }
        }
      }
    }

    StringBuilder linhaComAbreviacao = new StringBuilder();
    for (String atual : palavras) {
      char chave = atual.charAt(0);
      
      if(atual.equals(abreviacoes.get(chave))){
        String nova = Character.toString(chave) + ".";
        
        linhaComAbreviacao.append(nova).append(" ");
      }else{
        linhaComAbreviacao.append(atual).append(" "); 
      }
    }

    StringBuilder explicaAbreviacoes = new StringBuilder();
    for (char chave : abreviacoes.keySet()) {
      explicaAbreviacoes.append(String.format(chave + ". = " + abreviacoes.get(chave)) + "\n");
    }

    System.out.println(linhaComAbreviacao.toString().trim());
    System.out.println(abreviacoes.size());
    System.out.print(explicaAbreviacoes.toString());
  }

  public static int contarPalavras(List<String> palavras, String palavra) {
    int contador = 0;
    
    for (String atual : palavras) {
      if (atual.toLowerCase().equals(palavra.toLowerCase())) {
        contador++;
      }
    }
    
    return contador;
  }

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while (true) {
      String linha = ler.nextLine();

      if (linha.equals(".")) {
        break;
      } else {
        abreviar(linha);
      }
    }

    ler.close();
  }
}
