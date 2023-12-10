import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);  
    float salario, novoSalario, valorReajuste;
    salario = ler.nextFloat();
    if(salario >= 0 && salario <= 400.00){
      novoSalario = (float) (salario + (salario*0.15));
      valorReajuste = (float) (salario*0.15);
      System.out.printf("Novo salario: %.2f%n",novoSalario);
      System.out.printf("Reajuste ganho: %.2f%n",valorReajuste);
      System.out.println("Em percentual: 15 %");
    }else if(salario >= 400.01 && salario <= 800.00){
      novoSalario = (float) (salario + (salario*0.12));
      valorReajuste = (float) (salario*0.12);
      System.out.printf("Novo salario: %.2f%n",novoSalario);
      System.out.printf("Reajuste ganho: %.2f%n",valorReajuste);
      System.out.println("Em percentual: 12 %");
    }else if(salario >= 800.01 && salario <= 1200.00){
      novoSalario = (float) (salario + (salario*0.10));
      valorReajuste = (float) (salario*0.10);
      System.out.printf("Novo salario: %.2f%n",novoSalario);
      System.out.printf("Reajuste ganho: %.2f%n",valorReajuste);
      System.out.println("Em percentual: 10 %");
    }else if(salario >= 1200.01 && salario <= 2000.00){
      novoSalario = (float) (salario + (salario*0.07));
      valorReajuste = (float) (salario*0.07);
      System.out.printf("Novo salario: %.2f%n",novoSalario);
      System.out.printf("Reajuste ganho: %.2f%n",valorReajuste);
      System.out.println("Em percentual: 7 %");
    }else if(salario > 2000.00){
      novoSalario = (float) (salario + (salario*0.04));
      valorReajuste = (float) (salario*0.04);
      System.out.printf("Novo salario: %.2f%n",novoSalario);
      System.out.printf("Reajuste ganho: %.2f%n",valorReajuste);
      System.out.println("Em percentual: 4 %");
    } 
    ler.close();
  }
}