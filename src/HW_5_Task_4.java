import java.util.Arrays;
import java.util.Random;

public class HW_5_Task_4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Random().nextInt(0, 10);
        }
        System.out.println(Arrays.toString(arr));
        int min = 10;
        int max = 0;
        for (int j = 0; j < arr.length; j++){
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        System.out.println(min);
        for (int z = 0; z < arr.length; z++){
            if (max < arr[z]) {
                max = arr[z];
            }
        }
        System.out.println(max);
    }
}
