public class MergeSort {

    // Método principal de Merge Sort
    public void mergeSort(int[] arreglo, int izquierda, int derecha) {

        // Esta condición evita que siga dividiendo cuando ya hay un solo elemento
        // Si izquierda es menor que derecha, significa que todavía se puede dividir
        if (izquierda < derecha) {

            // Calculamos el punto medio del arreglo
            int medio = (izquierda + derecha) / 2;

            // ---------------------------
            // DIVIDIR
            // ---------------------------

            // Ordenamos la mitad izquierda
            mergeSort(arreglo, izquierda, medio);

            // Ordenamos la mitad derecha
            mergeSort(arreglo, medio + 1, derecha);

            // ---------------------------
            // UNIR (MERGE)
            // ---------------------------

            // Mezclamos las dos mitades ordenadas
            merge(arreglo, izquierda, medio, derecha);
        }
    }

    // Método que mezcla las dos mitades ordenadas
    public void merge(int[] arreglo, int izquierda, int medio, int derecha) {

        // Tamaño del arreglo izquierdo
        int n1 = medio - izquierda + 1;

        // Tamaño del arreglo derecho
        int n2 = derecha - medio;

        // Creamos arreglos temporales
        int[] izquierdaArray = new int[n1];
        int[] derechaArray = new int[n2];

        // ---------------------------
        // COPIAR DATOS
        // ---------------------------

        // Copiamos datos al arreglo izquierdo
        for (int i = 0; i < n1; i++) {

            izquierdaArray[i] = arreglo[izquierda + i];
        }

        // Copiamos datos al arreglo derecho
        for (int j = 0; j < n2; j++) {

            derechaArray[j] = arreglo[medio + 1 + j];
        }

        // Variables para recorrer arreglos
        int i = 0; // izquierdaArray
        int j = 0; // derechaArray

        // Variable para recorrer el arreglo original
        int k = izquierda;

        // ---------------------------
        // COMPARAR Y MEZCLAR
        // ---------------------------

        // Mientras existan elementos en ambos arreglos
        while (i < n1 && j < n2) {

            // Si el elemento izquierdo es menor o igual
            if (izquierdaArray[i] <= derechaArray[j]) {

                // Guardamos el menor en el arreglo original
                arreglo[k] = izquierdaArray[i];

                // Avanzamos en el arreglo izquierdo
                i++;
            } else {

                // Guardamos el elemento derecho
                arreglo[k] = derechaArray[j];

                // Avanzamos en el arreglo derecho
                j++;
            }

            // Avanzamos en el arreglo principal
            k++;
        }

        // ---------------------------
        // COPIAR SOBRANTES IZQUIERDA
        // ---------------------------

        // Si quedaron elementos en el arreglo izquierdo
        while (i < n1) {

            arreglo[k] = izquierdaArray[i];

            i++;
            k++;
        }

        // ---------------------------
        // COPIAR SOBRANTES DERECHA
        // ---------------------------

        // Si quedaron elementos en el arreglo derecho
        while (j < n2) {

            arreglo[k] = derechaArray[j];

            j++;
            k++;
        }
    }
}