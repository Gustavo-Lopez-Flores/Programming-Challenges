import java.util.*;
import java.time.LocalTime;

class Pessoa implements Comparable<Pessoa>{
  public String nome;
  public LocalTime horario;
  
  public Pessoa(String nome, LocalTime horario){
    this.nome = nome;
    this.horario = horario;
  }

  @Override
  public int compareTo(Pessoa p){
    return this.horario.compareTo(p.horario);
  }

  @Override
  public String toString(){
    return nome;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int p = ler.nextInt();
    int q = ler.nextInt();
    
    List<Pessoa> antesMeiaNoite = new ArrayList<>();
    List<Pessoa> depoisMeiaNoite = new ArrayList<>();
    LocalTime limiteSuperior = LocalTime.of(00, p, 0);
    LocalTime limiteInferior = LocalTime.of(23, 60-p, 0);

    for(int i = 0; i < q; i++){
      String horario = ler.next();
      String nome = ler.next();
      LocalTime horarioAvistamento = LocalTime.parse(horario+":00");

      boolean condicaoUm =     
      horarioAvistamento.isAfter(limiteInferior) || 
      horarioAvistamento.equals(limiteInferior);
      
      boolean condicaoDois =
      horarioAvistamento.isBefore(limiteSuperior) || 
      horarioAvistamento.equals(limiteSuperior) ||        
      horarioAvistamento.equals(LocalTime.of(00, 00, 0));
        
      if(condicaoUm){
        antesMeiaNoite.add(new Pessoa(nome, horarioAvistamento));
      }
      if(condicaoDois){
        depoisMeiaNoite.add(new Pessoa(nome, horarioAvistamento));
      }
    }

    Collections.sort(antesMeiaNoite);
    for(Pessoa ps : antesMeiaNoite){
      System.out.println(ps);
    }
  
    Collections.sort(depoisMeiaNoite);
    for(Pessoa pl : depoisMeiaNoite){
      System.out.println(pl);
    }

    ler.close();
  }
}