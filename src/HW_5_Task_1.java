import java.lang.reflect.Array;
import java.util.Arrays;

public class HW_5_Task_1 {
    public static void main(String[] args) {
        String[] recipe = {"Засушенная чешуя василиска",
                "Частичка души лесной феи",
                "Капля сока вампирской розы",
                "Яд шершавого ядозуба",
                "Осколок кометы",
                "Слеза феникса"};

// Порядок добавления: Капля сока вампирской розы,
// Слеза феникса, Засушенная чешуя василиска, Частичка души лесной феи,
// Яд шершавого ядозуба, Осколок кометы

        String[] potion = new String[6];
        potion[2] = "Капля сока вампирской розы";
        potion[5] = "Слеза феникса";
        potion[0] = "Засушенная чешуя василиска";
        potion[1] = "Частичка души лесной феи";
        potion[3] = "Яд шершавого ядозуба";
        potion[4] = "Осколок кометы";

        System.out.println(Arrays.equals(recipe, potion));

    }

}
