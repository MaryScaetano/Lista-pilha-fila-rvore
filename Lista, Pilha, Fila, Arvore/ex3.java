import java.util.Arrays;
import java.util.concurrent.locks.Condition;

public class ex3 {

    public static void main(String[] args) {
        int[] numeros = { 34, 13, 89, 144, 21, 55 };
        System.out.println("Lista A: " + Arrays.toString(numeros));
        System.out.println("Lista B: " + Arrays.toString(selectionSort(numeros)));
        System.out.println("Lista C: " + Arrays.toString(insertionSort(numeros)));
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
