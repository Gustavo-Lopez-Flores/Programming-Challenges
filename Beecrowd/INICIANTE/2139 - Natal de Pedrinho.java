import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, mes, dia, dias;
    int cal[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};
    while(ler.hasNext()){
      mes = ler.nextInt();
      dia = ler.nextInt();
      if(mes == 12 && dia == 25){
        System.out.println("E natal!");
      }else if(mes == 12 && dia == 24){
        System.out.println("E vespera de natal!");
      }else if(mes == 12 && dia > 25){
        System.out.println("Ja passou!");
      }else{
        if(mes == 12){
          dias = Math.abs(dia-25);        
        }else{
          dias = Math.abs(cal[mes]-dia) + 25;        
          for(i=mes+1;i<12;i++){
            dias+=cal[i];
          }
        }
        System.out.printf("Faltam %d dias para o natal!%n",dias);
      }
    }
    ler.close();
  }
}
