import java.util.Objects;
import java.util.Scanner;

public class Man extends Human implements Worker{
    public Man(String name, int age, String sex) {
        super(name, age, sex);
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public void jobName() {
        System.out.println("Which name of company where you worked?");
        String cache = scanner.nextLine();
        System.out.println("Never heard about them. But you need us! Welcome");
    }


    protected boolean frameAge(String integerCache){

        int result = Integer.parseInt(integerCache);
        if (result <= 18 || result >= 40 ){
            System.out.println("Sorry, yor age not accepted");
            return false;
        }
        System.out.println("This age accepted!");
        return true;
    }
    protected boolean frameExp(String integerCache){

        int result = Integer.parseInt(integerCache);
        if (result <= 2 || result >= 20 ){
            System.out.println("Sorry, yor age not accepted");
            return false;
        }
        System.out.println("Nice opportunity, good experience!");
        return true;
    }
    @Override
    public void experience() {
        super.askAge();
        String age = scanner.nextLine();
        frameAge(age);

        System.out.println("Do you have job experience. How many years?");

        String exp = scanner.nextLine();
        frameExp(exp);
    }


    @Override
    public void sex() {
        System.out.println("Chose your sex: Men/Woman");
        String cache = scanner.nextLine();
        if (Objects.equals(cache, "Men")){
            System.out.println("--- It's grate!");

        } else if (Objects.equals(cache, "Woman")){
            System.out.println("-- Sorry, will continue to work");
        } else{
            System.out.println("-- Unknown command!");
        }
    }

    @Override
    public void name() {
        super.askName();
        String cache = scanner.nextLine();
        System.out.println("Nice to meet you " + cache);
    }

}
