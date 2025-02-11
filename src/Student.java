public class Student {
    String name;
    String facult;
    int age;
    String[] spskills = new String[3];

    public Student(String name, String facult, int age, String[] spskills){
        this.name = name;
        this.facult = facult;
        this.age = age;
        this.spskills = spskills;
    }
    public String getName(){
        return name;
    }
    public String getFacult(){
        return facult;
    }
    public int getAge(){
        return age;
    }
    public String[] getSpskills(){
        return spskills;
    }
}
