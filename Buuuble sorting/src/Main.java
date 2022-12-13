import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void swap(int[] a, int i, int k) {

        int temp = a[i];
        a[i] = a[k];
        a[k] = temp;

    }


    public static void main(String[] args) {

        Random random = new Random();
        int object = random.nextInt(2, 10);


        int[] list = new int[object];

        for (int i = 0; i < object; i++) {
            list[i] = random.nextInt(100);
        }

        System.out.println("Array before swap " + Arrays.toString(list));


        for (int i = 0; i < list.length; i++) {
            for (int k = 0; k < list.length-1; k++) {
                if (list[k] > list[k + 1]) {
                    swap(list, k, k + 1);
                }
            }
        }

        System.out.println("Array after swap " + Arrays.toString(list));
    }
}
