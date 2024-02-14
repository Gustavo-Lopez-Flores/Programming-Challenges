import java.io.*;
import java.util.*;
import java.util.stream.*;

class NoArvore{
  int valor;
  NoArvore esq;
  NoArvore dir;

  NoArvore(int valor){
    this.valor = valor;
    this.esq = null;
    this.dir = null;
  }
}
public class buscar {
  static NoArvore insert(NoArvore raiz, int valor){
    if(raiz == null){
      return new NoArvore(valor);
    }

    if(valor < raiz.valor){
      raiz.esq = insert(raiz.esq, valor);
    }else{
      raiz.dir = insert(raiz.dir, valor);
    }
    
    return raiz;
  }
  static String preorder(NoArvore raiz, StringBuilder sb){
    if(raiz != null){
      sb.append(raiz.valor + " ");
      preorder(raiz.esq, sb);
      preorder(raiz.dir, sb);
    } 
    return sb.toString();
  }
  static String inorder(NoArvore raiz, StringBuilder sb){
    if(raiz != null){
      inorder(raiz.esq, sb);
      sb.append(raiz.valor + " ");
      inorder(raiz.dir, sb);
    } 
    return sb.toString();
  }
  static String posorder(NoArvore raiz, StringBuilder sb){
    if(raiz != null){
      posorder(raiz.esq, sb);
      posorder(raiz.dir, sb);
      sb.append(raiz.valor + " ");
    }
    return sb.toString();
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] nos = Stream.of(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    NoArvore raiz = null;

    for(int no : nos){
      raiz = insert(raiz, no);
    }

    String pre = preorder(raiz, new StringBuilder());
    System.out.println(pre.trim());
    String in = inorder(raiz, new StringBuilder());
    System.out.println(in.trim());
    String pos = posorder(raiz, new StringBuilder());
    System.out.println(pos.trim());
  }
}
