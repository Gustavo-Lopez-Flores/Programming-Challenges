import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int casos = ler.nextInt();
        for (int i = 0; i < casos; i++) {
            int tamArr = ler.nextInt();
            int[] arr = new int[tamArr];

            for (int j = 0; j < tamArr; j++) {
                arr[j] = ler.nextInt();
            }

            ArrayList<Integer> onlyOdd = filterOddNumbers(arr);

            if (onlyOdd.size() > 0) {
                Collections.sort(onlyOdd);
                printOrderedOddNumbers(onlyOdd);
            }else{
              System.out.println();
            }
        }

        ler.close();
    }

    private static ArrayList<Integer> filterOddNumbers(int[] arr) {
        ArrayList<Integer> onlyOdd = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                onlyOdd.add(arr[j]);
            }
        }
        return onlyOdd;
    }

    private static void printOrderedOddNumbers(ArrayList<Integer> onlyOdd) {
        StringBuilder sb = new StringBuilder();

        int tamArrOdd = onlyOdd.size();
        for (int j = 0; j < tamArrOdd; j++) {
            if (j % 2 == 0) {
                sb.append(onlyOdd.get(tamArrOdd - 1 -(j / 2))).append(" ");
            } else {
                sb.append(onlyOdd.get(j / 2)).append(" ");
            }
        }

        int tamSb = sb.toString().length();
        System.out.println(sb.toString().substring(0, tamSb - 1));
    }
}
