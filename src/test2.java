public class test2 {
    public static void main(String[] args) {
        Human person1 = new Human("Stepan", 10);
        person1.getInfo();
        Human person2 = new Human();
        person2.getInfo();
    }
        }
class Human{
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Human(){
        this.name = "Имя не определено";
        this.age = 0;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name+ " мне " + age + " лет");
    }
}