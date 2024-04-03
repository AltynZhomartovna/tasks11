public class BubbleSort {
    public static void main(String[] args) {
        double[] array = {5.4, 3.2, 7.8, 1.9, 9.0};

        // Сортировка массива методом пузырька
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Вывод отсортированного массива
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
