
public abstract class Human {

    protected String name;
    protected int age;
    protected String sex;

    public Human(String name, int age, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public void askAge(){
        System.out.println("How old are you?");
    }
    public void askName(){
        System.out.println("Hello! What is your name?");
    }

}
