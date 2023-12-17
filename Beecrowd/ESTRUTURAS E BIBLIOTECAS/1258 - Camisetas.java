import java.util.*;

public class Main {
  static class Camiseta implements Comparable<Camiseta>{
    String nome, cor;
    char tamanho;

    public Camiseta(String nome, String cor, char tamanho){
      this.nome = nome;
      this.cor = cor;
      this.tamanho = tamanho;
    }

    @Override
    public int compareTo(Camiseta outraCamiseta){
      if(this.cor.equals("branco") && outraCamiseta.cor.equals("vermelho")){
        return -1;
      }else if(this.cor.equals("vermelho") && outraCamiseta.cor.equals("branco")){
        return 1;
      }else{
        if((this.tamanho == 'P' && (outraCamiseta.tamanho == 'M' || outraCamiseta.tamanho == 'G')) ||
           (this.tamanho == 'M' && (outraCamiseta.tamanho == 'G'))){
          return -1;
        }else if((outraCamiseta.tamanho == 'P' && (this.tamanho == 'M' || this.tamanho == 'G')) ||
                 (outraCamiseta.tamanho == 'M' && (this.tamanho == 'G'))){
          return 1;
        }else{  
          return this.nome.compareTo(outraCamiseta.nome);
        }
      }
    }
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    try {
        boolean pulaLinha = false;
        int qtdCamisetas;

        while ((qtdCamisetas = ler.nextInt()) != 0) {
          ler.nextLine(); 
          
          List<Camiseta> camisetas = new ArrayList<>(qtdCamisetas);
  
          for (int i = 0; i < qtdCamisetas; i++) {
            String nome = ler.nextLine();
            String cor = ler.next();
            char tamanho = ler.next().charAt(0);
            ler.nextLine();
            camisetas.add(new Camiseta(nome.trim(), cor, tamanho));
          }
  
          Collections.sort(camisetas);
  
          StringBuilder sb = new StringBuilder();
  
          if (pulaLinha)
            sb.append("\n");
  
          for (Camiseta c : camisetas) {
            sb.append(c.cor).append(" ").append(c.tamanho).append(" ").append(c.nome).append("\n");
          }
  
          System.out.print(sb.toString());
  
          pulaLinha = true;
        }
    } finally {
      ler.close();
    }

    ler.close();
  }
}