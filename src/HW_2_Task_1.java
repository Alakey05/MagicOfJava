import java.util.Random;

public class HW_2_Task_1 {
    public static void main(String[] args) {
        int a = new Random().nextInt();
        int b = new Random().nextInt();
        int c = new Random().nextInt();
        int d = new Random().nextInt();
        int e = new Random().nextInt();
        String ass = "" + a + b + c + d + e;
        String ass1 = ass.replaceAll("1","i");
        String ass2 = ass1.replaceAll("-", "");
        String ass3 = ass2.replaceAll("0", "o");
        String ass4 = ass3.replaceAll("6", "b");
        System.out.println(ass4);
        System.out.println(ass4.contains("23"));
        System.out.println(ass4.indexOf("ob"));
    }
}
