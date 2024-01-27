import java.util.*;

public class Main {
  static class Modulo implements Comparable<Modulo> {
    int valor;
    int mod;

    public Modulo(int valor, int mod){
      this.valor = valor;
      this.mod = mod;
    }

    @Override
    public int compareTo(Modulo o){
      if(this.mod == o.mod){
        if(this.valor % 2 == 0 && o.valor % 2 != 0){
           return 1;
        }else if(this.valor % 2 != 0 && o.valor % 2 == 00){
           return -1;
        }else if(this.valor % 2 == 0 && o.valor % 2 == 0){
          if(this.valor < o.valor){
            return -1;
          }else{
            return 1;
          }
        }else{
          if(this.valor > o.valor){
            return -1;
          }else{
            return 1;
          }
        }
      }else{
        return this.mod - o.mod; 
      }
    }

    @Override
    public String toString(){
      return "" + this.valor;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(sc.hasNext()){
      int quantidade = sc.nextInt();
      int numero = sc.nextInt();

      if(quantidade == 0 && numero == 0){
        System.out.println("0 0");
        break;          
      }

      List<Modulo> modulos = new ArrayList<>();
      for(int i = 0; i < quantidade; i++){
        int valor = sc.nextInt();
        int mod = valor % numero;
        modulos.add(new Modulo(valor, mod));
      }

      Collections.sort(modulos);
      System.out.println(quantidade + " " + numero);
      modulos.forEach(System.out::println);
    }

    sc.close();
  }
}
