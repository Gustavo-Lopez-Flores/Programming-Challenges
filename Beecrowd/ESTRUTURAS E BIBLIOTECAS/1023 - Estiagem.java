import java.util.*;

class CityData {
    int moradores;
    int consumo;

    public CityData(int moradores, int consumo) {
        this.moradores = moradores;
        this.consumo = consumo;
    }

    public int getMoradores() {
        return moradores;
    }

    public int getConsumo() {
        return consumo;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            if (contador > 1) {
                System.out.println();
            }

            List<CityData> cityDataList = new ArrayList<>();
            int somaPessoa = 0;
            int somaConsumo = 0;

            for (int i = 0; i < n; i++) {
                int moradores = scanner.nextInt();
                int consumo = scanner.nextInt();
                cityDataList.add(new CityData(moradores, consumo));
                somaPessoa += moradores;
                somaConsumo += consumo;
            }

            Collections.sort(cityDataList, new Comparator<CityData>() {
                @Override
                public int compare(CityData c1, CityData c2) {
                    int cmp = Integer.compare(c2.consumo, c1.consumo);
                    if (cmp != 0) {
                        return cmp;
                    }
                    return Integer.compare(c1.moradores, c2.moradores);
                }
            });

            System.out.println("Cidade# " + contador + ":");

            Map<Integer, Integer> mediaMap = new TreeMap<>();
            int totalMoradores = 0;

            for (CityData cityData : cityDataList) {
                totalMoradores += cityData.moradores;
                int consumoMedio = cityData.consumo / cityData.moradores;
                mediaMap.put(consumoMedio, mediaMap.getOrDefault(consumoMedio, 0) + cityData.moradores);
            }

            List<String> mediaStrings = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : mediaMap.entrySet()) {
                mediaStrings.add(entry.getValue() + "-" + entry.getKey());
            }

            System.out.println(String.join(" ", mediaStrings));

            double consumoMedio = (double) somaConsumo / totalMoradores;
            consumoMedio = Math.floor(consumoMedio * 100) / 100;

            System.out.printf("Consumo medio: %.2f m3.%n", consumoMedio);

            contador++;
        }
    }
}
