import java.util.Random;

public class HW_4_Quidditch {
    public static void main(String[] args) {
        HW_4_Quidditch quidditch = new HW_4_Quidditch();
        quidditch.getBalls();
        quidditch.playGame();
    }
    public void getBalls(){
        for(int i = 1; i <= 3 ; i++){
            System.out.print("Запущен мяч под названием ");
            if (i == 1){
                System.out.println("Quaffle");
            } else if (i == 2){
                System.out.println("Bludger");
            } else {
                System.out.println("Golden Snitch");
            }
        }
    }
    public void playGame(){
        while (true){
            int control = new Random().nextInt(0, 100);
            if (control == 50){
                System.out.println("Снитч пойман!");
                break;
            }
            System.out.println("Here we go again)");
        }
    }
}
