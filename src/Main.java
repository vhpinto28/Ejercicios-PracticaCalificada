
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // Arreglo de ejemplo
    int[] array1 = {4, 2, 1, 5, 3};
    int[] array2 = {7, 10, 3, 8, 6};
    int[] array3 = {9, 2, 6, 1, 5};
    
    // Ordenar los arreglos utilizando selectionSort()
    selectionSort(array1);
    selectionSort(array2);
    selectionSort(array3);
    
    // Imprimir los arreglos ordenados
    System.out.print("Arreglo 1 ordenado: ");
    showArray(array1);
    System.out.print("Arreglo 2 ordenado: ");
    showArray(array2);
    System.out.print("Arreglo 3 ordenado: ");
    showArray(array3);
  }
  
  public static void selectionSort(int[] a) {
    int min;
    for (int i = 0; i < a.length - 1; i++) {
      min = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[min] > a[j])
          min = j;
      }
      int aux = a[min];
      a[min] = a[i];
      a[i] = aux;
    }
  }
  
  public static void showArray(int[] a) {
    System.out.println(Arrays.toString(a));
  }
}
