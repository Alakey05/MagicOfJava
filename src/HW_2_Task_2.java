import com.sun.jdi.Value;

import java.util.Random;

public class HW_2_Task_2 {
    public static void main(String[] args) {
        castSpell();
    }
    public static void castSpell() {
        String a = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        String b = a.toLowerCase();
        int start = new Random().nextInt(0, 50);
        String c = b.substring(start);
        StringBuilder spell = new StringBuilder(c);
        spell.reverse();
        spell.replace(0, 1, String.valueOf(1));
        spell.replace(1, 2, String.valueOf(0));
        System.out.println(spell);
    }
}
