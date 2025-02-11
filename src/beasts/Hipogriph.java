package beasts;

public class Hipogriph {

        String name;
        int age;
        String color;
        boolean isFly;

        public Hipogriph(String name, int age, String color, boolean isFly) {
            this.name = name;
            this.age = age;
            this.color = color;
            this.isFly = isFly;
        }

        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public String getColor(){
            return color;
        }
        public boolean getIsFly(){
            return isFly;
        }
        public  void setName(String name){
            this.name = name;
        }

        public void eat(String food){
            System.out.println("");
        }
}
