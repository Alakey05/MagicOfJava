public class HW_4_Task_3 {
    public static void main(String[] args) {
        int summa = 0;
        for (int i = 222; i <= 444; i++){

            if (i % 2 == 0){
                summa = i + summa;
            }
        }
        System.out.println(summa);
    }
}
