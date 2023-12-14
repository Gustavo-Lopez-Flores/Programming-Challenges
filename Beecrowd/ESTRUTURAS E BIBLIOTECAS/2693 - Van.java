import java.util.*;

public class Main {
  static class Aluno implements Comparable<Aluno>{
    String nome;
    char regiao;
    int distancia;

    public Aluno(String nome, char regiao, int distancia){
      this.nome = nome;
      this.regiao = regiao;
      this.distancia = distancia;
    }

    @Override
    public int compareTo(Aluno outroAluno){
      if((this.distancia - outroAluno.distancia) == 0){
        if(((int)this.regiao - (int)outroAluno.regiao) == 0){
          return this.nome.compareTo(outroAluno.nome);
        }else{
          return (int)this.regiao - (int)outroAluno.regiao;
        }
      } else{
        return this.distancia - outroAluno.distancia;
      }
    }
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNext()){
      int qtdAlunos = ler.nextInt();
      List<Aluno> alunos = new ArrayList<>(qtdAlunos);
      for(int i = 0; i < qtdAlunos; i++){
        String nome = ler.next(); 
        char regiao = ler.next().charAt(0);
        int distancia = ler.nextInt();
        alunos.add(new Aluno(nome, regiao, distancia));
      }

      Collections.sort(alunos);

      StringBuilder sb = new StringBuilder();
      for(Aluno aluno : alunos){
        sb.append(aluno.nome).append("\n");
      }
      System.out.print(sb.toString());
    }

    ler.close();
  }
}