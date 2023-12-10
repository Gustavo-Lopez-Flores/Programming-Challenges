import java.util.*;

class Grafo {
    private int vertices;
    private List<List<Integer>> adjacencias;

    public Grafo(int vertices) {
        this.vertices = vertices;
        this.adjacencias = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencias.add(new LinkedList<>());
        }
    }

    public void adicionarAresta(int origem, int destino) {
        adjacencias.get(origem).add(destino);
        adjacencias.get(destino).add(origem); // Grafo não direcionado
    }

    public boolean bfs(int inicio) {
        boolean[] visitado = new boolean[vertices];
        Queue<Integer> fila = new LinkedList<>();

        visitado[inicio] = true;
        fila.offer(inicio);

        while (!fila.isEmpty()) {
            int vertice = fila.poll();

            for (Integer adjacente : adjacencias.get(vertice)) {
                if (!visitado[adjacente]) {
                    visitado[adjacente] = true;
                    fila.offer(adjacente);
                }
            }
        }

        for (int i = 1; i < vertices; i++){
          if(visitado[i] == false){
            return false;
          }
        }
      
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int l = ler.nextInt();
        n++;
      
        Grafo grafo = new Grafo(n);

        for(int i = 0; i < l; i++){
          int origem = ler.nextInt();
          int destino = ler.nextInt();
          grafo.adicionarAresta(origem, destino);
        }
  
        if(grafo.bfs(1)){
          System.out.println("COMPLETO");
        }else{
          System.out.println("INCOMPLETO");
        }
      
        ler.close();
    }
}
