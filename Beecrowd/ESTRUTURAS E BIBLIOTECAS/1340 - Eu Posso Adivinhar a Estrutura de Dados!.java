import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNext()){
      int n = ler.nextInt();

      Deque<Integer> pilha = new ArrayDeque<>();
      Queue<Integer> fila = new LinkedList<>();
      PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>(Collections.reverseOrder());

      StringBuilder sbPilha = new StringBuilder();
      StringBuilder sbFila = new StringBuilder();
      StringBuilder sbFilaPrioridade = new StringBuilder();
      StringBuilder resultado = new StringBuilder();

      for(int i = 0; i < n; i++){
        int op = ler.nextInt();
        int val = ler.nextInt();

        if(op == 1){
          pilha.push(val);
          fila.offer(val);
          filaPrioridade.offer(val);
        }else{
          sbPilha.append(pilha.pop());
          sbFila.append(fila.poll());
          sbFilaPrioridade.append(filaPrioridade.poll());
          resultado.append(val);
        }
      }

      boolean ehPilha = resultado.toString().equals(sbPilha.toString()) && 
                      !(resultado.toString().equals(sbFila.toString()) ||
                        resultado.toString().equals(sbFilaPrioridade.toString()));
      boolean ehFila = resultado.toString().equals(sbFila.toString()) && 
                     !(resultado.toString().equals(sbPilha.toString()) ||
                       resultado.toString().equals(sbFilaPrioridade.toString()));
      boolean ehFilaPrioridade = resultado.toString().equals(sbFilaPrioridade.toString()) && 
                     !(resultado.toString().equals(sbFila.toString()) || 
                       resultado.toString().equals(sbPilha.toString()));
      boolean impossible = !(resultado.toString().equals(sbPilha.toString()) || 
       resultado.toString().equals(sbFila.toString()) || 
       resultado.toString().equals(sbFilaPrioridade.toString())); 

      if(ehPilha){
        System.out.println("stack");
      }else if(ehFila){
        System.out.println("queue");
      }else if(ehFilaPrioridade){
        System.out.println("priority queue");
      }else if(impossible){
        System.out.println("impossible");
      }else{
        System.out.println("not sure");
      }
    }



    ler.close();
  }
}
