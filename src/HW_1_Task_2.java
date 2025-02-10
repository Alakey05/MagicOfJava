import java.util.Random;

public class HW_1_Task_2 {
    public static void main(String[] args) {
        int grade1, grade2;
        grade1 = new Random().nextInt(1, 10);
        grade2 = new Random().nextInt(1, 10);
        System.out.println(grade1);
        System.out.println(grade2);

        boolean result = grade1 > 5 && grade2 > 5;
        System.out.println(result);

        double arm = ((double) grade1 + (double) grade2) / 2;
        System.out.println(arm);
    }
}
