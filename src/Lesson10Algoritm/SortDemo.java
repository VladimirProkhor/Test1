package Lesson10Algoritm;

import java.util.Arrays;

public class SortDemo {

    public static final int MAX_VALUE = Integer.MAX_VALUE;
    public static final int SIZE = 10;

    public static void main(String[] args) {
//        int[] array = new int[SIZE];
        int[] array = new int[]{52, 35, 45, 12, 60, 69, 68, 63, 67};
        for (int i = 0; i < array.length; i++) {
            //создаем массив случайных чисел
//            array[i] = ThreadLocalRandom.current().nextInt();
//            System.out.println(binarySearch0(array, 69));
            quickSort(array,0,array.length-1);
            System.out.println(Arrays.toString(array));
        }
//        int[]array1 = array.clone();
//        int [] array2 = array.clone();
//        bubbleSort(array1);
//        System.out.println(Arrays.toString(array1));
//        mergeSort(array2);
//        System.out.println(Arrays.toString(array2));
    }

    private static void mergeSort(int[] array) {
        //делаем проверку , чтобы когда вызвали метод сортировки mergesort  у нас не получилось ,  деление до бесконечности и потом получим ошибку StackOverFlow
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);
            mergeSort(left);
            mergeSort(right);
            int[] result = merge(left, right);
            System.arraycopy(result, 0, array, 0, array.length);
        }
    }

    private static int[] merge(int[] left, int[] right) {
        //создаем массив у котрого параметры лефт и райт
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < result.length; k++) {
            //если у нас райт равен длинне маассива райт или лефт еще остались элементы массива лефт и элемент массива лефт меньше чем элемент массива райт
            if (j == right.length || (i < left.length && left[i] < right[j])) {
                //то в элемент массива присваиваем значение элемента массива лефт, ++ чтобы прошло по всем элементам массива лефт
                result[k] = left[i++];
            } else {
                result[k] = right[j++];
            }
        }
        return result;
    }

    private static void bubbleSort(int[] array) {
        for (int lastIndex = array.length - 1; lastIndex >= 0; lastIndex--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }
        }
    }

    //    private static int binatySerch(int[] array, int key, int max, int min) {
//       Arrays.sort(array);
//        int left = min;
//        int right = max ;
//
//        while (left <= right) {
//            int mid = (left + right)>>>1;
//            int midVal = array[mid];
//            if (midVal==key){
//                mid = key;
//            } else if (midVal < key) {
//                right = mid + 1;
//
//            }else
//                left = mid -1;
//        }return -1;
//    }
    private static int binarySearch0(int[] a,
                                     int key) {
        Arrays.sort(a);
        int low = 1;
        int high = a.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1;  // key not found.
    }

    private static void quickSort(int[] array, int left, int right) {
        if (array.length == 0) return;
        if (left >= right) return;
        //щем опорный элемент
        int mid = left + (right - left) / 2;
        int opora = array[mid];
        // делаем подмасивы правой и левой части
        int i = left;
        int j = right;
        while (i <= j) {
            while (array[i] < opora ) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        //делаем рекурсию под массивов правой и левой
        if (left < j) {
            quickSort(array, left, j);
        }
        if (right > i) {
            quickSort(array, i, right);
        }
    }
}
