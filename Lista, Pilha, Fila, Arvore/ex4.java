import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.locks.Condition;

public class ex4 {
    // Prontuario: SP3044921

    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(921);
        }
        System.out.println("Lista A: " + Arrays.toString(array));
        System.out.println("Lista B: " + Arrays.toString(selectionSort(array)));
        System.out.println("Lista C: " + Arrays.toString(insertionSort(array)));
    }

    public static int[] selectionSort(int[] lista) {
        int n = lista.length;

        for (int posInicial = 0; posInicial < n - 1; posInicial++) {

            int maiorIndex = posInicial;
            for (int i = posInicial; i < n; i++) {
                if (lista[i] > lista[maiorIndex]) {
                    maiorIndex = i;
                }
            }

            if (lista[posInicial] > maiorIndex) {
                int aux = lista[posInicial];
                lista[posInicial] = lista[maiorIndex];
                lista[maiorIndex] = aux;
            }
        }
        return lista;

    }

    public static int[] insertionSort(int[] lista) {

        int aux, j;
        for (int i = 0; i < lista.length; i++) {
            aux = lista[i];
            j = i - 1;
            while (j >= 0 && lista[j] < aux) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = aux;
        }
        return lista;
    }
}
