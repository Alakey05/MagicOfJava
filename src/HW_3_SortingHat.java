import java.util.Scanner;

public class HW_3_SortingHat {
    public static void main(String[] args) {
        HW_3_SortingHat sortingHat = new HW_3_SortingHat();
        sortingHat.sort();
    }
    public void sort(){
        String question1, question2, question3, question4;
        question1 = "Ты предпочитаешь работать в команде? (Да/Нет)";
        question2 = "Ты любишь разгадывать головоломки? (Да/Нет)";
        question3 = "Ты идешь на риск, чтобы достичь своей цели? (Да/Нет)";
        question4 = "Ты проявляешь заботу к существам и природе? (Да/Нет)";

        Scanner scanner = new Scanner(System.in);
        System.out.println(question1);
        String answer1 = scanner.nextLine();
        System.out.println(question2);
        String answer2 = scanner.nextLine();
        System.out.println(question3);
        String answer3 = scanner.nextLine();
        System.out.println(question4);
        String answer4 = scanner.nextLine();

        if (answer1.equalsIgnoreCase("да")){
            if (answer3.equalsIgnoreCase("Да")){
                System.out.println("Поздравляю, ты попал(а) в Гриффиндор");
            } else if (answer4.equalsIgnoreCase("да")){
                System.out.println("Поздравляю, ты попал(а) в Пуффендуй");
            }
        } else if (answer2.equalsIgnoreCase("да")){
            if (answer1.equalsIgnoreCase("да")){
                System.out.println("Поздравляю, ты попал(а) в Когтеврам");
            } else if(answer3.equalsIgnoreCase("да")) {
                System.out.println("Поздравляю, ты попал(а) в Кгодеврам");
            } else {
                System.out.println("Поздравляю, ты попал(а) в Слизерин");
            }
        } else if (answer3.equalsIgnoreCase("да")) {
            System.out.println("Поздравляю, ты попал(а) в Слизерин");
        } else {
            System.out.println("Поздравляю, ты попал(а) в Пуффендуй");
        }
    }
}
