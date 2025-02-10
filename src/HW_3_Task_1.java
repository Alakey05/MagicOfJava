import java.util.Random;

public class HW_3_Task_1 {
    public static void main(String[] args) {
        int a, b;
        a = new Random().nextInt(0, 20);
        b = new Random().nextInt(0, 20);

        System.out.println(a);
        System.out.println(b);

        if (a % 2 == 0 && b % 2 == 0 ){
            System.out.println((a / 2) + (b / 2));
        } else if (a % 2 == 0 && b % 2 != 0){
            System.out.println((a / 2) + b);
        } else if (a % 2 != 0 && b % 2 == 0){
            System.out.println((b / 2) + a);
        } else {
            System.out.println(a + b);
        }
    }
}
