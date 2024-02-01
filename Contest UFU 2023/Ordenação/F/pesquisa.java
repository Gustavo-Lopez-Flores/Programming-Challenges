import java.io.*;
import java.util.*;
import java.util.stream.*;

public class pesquisa {
  public static class Pessoa{
    String nome;
    int idade;
    
    public Pessoa(String nome, int idade){
      this.nome = nome;
      this.idade = idade;
    }

    public String getNome(){
      return nome;
    }

    public int getIdade(){
      return idade;
    }
    
    @Override
    public String toString() {  
      return nome;
    }
}

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    int quantidadePessoas = Integer.parseInt(br.readLine());
    List<Pessoa> pessoas = IntStream.range(0, quantidadePessoas)
      .mapToObj(i -> {
        try{
          String[] dados = br.readLine().split(",", 2);
          return new Pessoa(dados[0], Integer.parseInt(dados[1]));
        }catch(IOException e){
          throw new RuntimeException(e);
        }
      })
      .collect(Collectors.toList());

    pessoas.sort(Comparator.comparing(Pessoa::getIdade).reversed()
    .thenComparing(Comparator.comparing(Pessoa::getNome)));

    pessoas.forEach(System.out::println);
    br.close();
  }
}
