import java.io.*;
import java.util.*;
import java.math.*;

public class idade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int anoNasc = scanner.nextInt();
    int matricula = scanner.nextInt();

    boolean elegivel = (anoNasc >=2000) || (matricula >= 2019);

    if(elegivel)
      System.out.println("Sim");
    else
      System.out.println("Nao");

    scanner.close();
  }
}