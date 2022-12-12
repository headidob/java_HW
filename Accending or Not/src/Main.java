import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {


        boolean parameter = true;

        Random random = new Random();
        int objectsInArray = random.nextInt(2, 10);
        //начинаем с 2 так чтобы выдавал минимум два значения в массив
        //я не нашел стандартный метод как сделать чтобы отсчет начинался с 2 но не имел верхней границы, разве что через еще один цикл



        int[] array = new int[objectsInArray];
        array[0] = 0;
        int k = 0;

        for (int i = 0; i < objectsInArray; i++) {
            array[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length-1 && parameter==true; i++) {
            k = i + 1;
            if (array[i] < array[k]) {
                parameter = true;
            } else {
                parameter = false;
            }

        }

        if(parameter==true){
        System.out.println("Предоставленный массив возрастающий");
        }else{

        System.out.println("Предоставленный массив НЕ возрастающий");
        }
    }
}
