public class App {

    public static void main(String[] args) {

        // Creamos un arreglo de números desordenados
        int[] numeros = {5, 10, 20, 2, 40, 33, 7, 22, 4, 39, 1};

        // Mostramos el arreglo antes de ordenar
        System.out.println("Arreglo original:");
        mostrar(numeros);

        // Creamos un objeto de la clase MergeSort
        MergeSort merge = new MergeSort();

        // Llamamos al método mergeSort
        // Parámetros:
        // arreglo -> arreglo a ordenar
        // 0 -> posición inicial
        // numeros.length - 1 -> última posición
        merge.mergeSort(numeros, 0, numeros.length - 1);

        // Mostramos el arreglo ya ordenado
        System.out.println("\nArreglo ordenado:");
        mostrar(numeros);
    }

    // Método para mostrar el arreglo
    public static void mostrar(int[] arreglo) {

        // Recorremos el arreglo usando foreach
        for (int num : arreglo) {

            // Imprimimos cada número
            System.out.print(num + " ");
        }

        System.out.println();
    }
}