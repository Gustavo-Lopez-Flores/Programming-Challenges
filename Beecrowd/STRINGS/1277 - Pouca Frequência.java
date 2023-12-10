import java.util.Scanner;

public class Main {
  static float calcularFrequencia(String frequencia) {
    int dispensa = 0, presenca = 0, total = frequencia.length();
    for(int i = 0; i < total; i++){
      if(frequencia.charAt(i) == 'M'){
        dispensa++;
      }
      if(frequencia.charAt(i)=='P'){
        presenca++;      
      }
    }
    
    total = total - dispensa;
    float frequenciaDoAluno = (float)((100.0 * presenca)/total);
    
    return frequenciaDoAluno;
  }
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int numeroDeCasos = ler.nextInt();
    ler.nextLine();

    for (int i = 0; i < numeroDeCasos; i++) {
      int numeroDeAlunos = ler.nextInt();
      ler.nextLine();

      String[] alunos = new String[numeroDeAlunos];
      String[] frequencia = new String[numeroDeAlunos];

      for (int j = 0; j < numeroDeAlunos; j++) {
        alunos[j] = ler.next();
      }

      for (int j = 0; j < numeroDeAlunos; j++) {
          frequencia[j] = ler.next();
      }

      StringBuilder semExame = new StringBuilder();
      for (int j = 0; j < numeroDeAlunos; j++) {
        float porcentagemPresenca = calcularFrequencia(frequencia[j]);
        if (porcentagemPresenca < 75) {
          semExame.append(alunos[j]).append(" ");
        }
      }

      System.out.println(semExame.toString().trim());

    }

    ler.close();
  }
}