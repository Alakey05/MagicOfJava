import java.util.Arrays;
import java.util.Scanner;

public class HW_5_Potion {
    public static void main(String[] args) {
        HW_5_Potion potion = new HW_5_Potion();
        potion.prepare();
    }

    public void prepare() {
        Scanner scanner = new Scanner(System.in);

        String[] ingredients = new String[3];
        ingredients[0] = "Драконий коготь";
        ingredients[1] = "Лист мандрагоры";
        ingredients[2] = "Корень шершавой астрелии";

        System.out.println("Добро пожаловать в лабораторию зелий!");
        System.out.println("Введите ингредиенты, которые у вас есть (через запятую):");

        String input = scanner.nextLine();

        String[] userIngredients = input.split(",");
        System.out.println(Arrays.toString(userIngredients));

        String[] requiredIngredients = new String[6];
        requiredIngredients[0] = "Капля сока вампирской розы";
        requiredIngredients[1] = "Слеза феникса";
        requiredIngredients[2] = "Засушенная чешуя василиска";
        requiredIngredients[3] = "Частичка души лесной феи";
        requiredIngredients[4] = "Яд шершавого ядозуба";
        requiredIngredients[5] = "Осколок кометы";

        int count = 0;
        for (int i = 0; i < requiredIngredients.length; i++){
            if(requiredIngredients[i].equalsIgnoreCase(userIngredients[i])){
                count ++;
            }
        }
        if (count == requiredIngredients.length){
            System.out.println("У вас есть все необходимые ингредиенты для зелья! Можете начинать создание.");
        } else {
            System.out.println("У вас не хватает некоторых ингредиентов. Нельзя приступать к созданию зелья.");
        }

    }
}
