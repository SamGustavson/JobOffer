public class Main {
    public static void main(String[] args) {

        Human a = new Man("Alex", 33 , "Man");
        Human v = new Man("Victor", 20 , "Man");
        Human b = new Man("Bob", 24 , "Man");
        Human m = new Man("Mario", 22 , "Man");
        Human t = new Man("Tommy ", 29 , "Man");

        Human [] array = new Human[5];
        array[0]= a;
        array[1]= v;
        array[2]= b;
        array[3]= m;
        array[4]= t;



        Worker[] team = new Worker[5];

        team[0] = (Worker) a;
        team[1] = (Worker) v;
        team[2] = (Worker) b;
        team[3] = (Worker) m;
        team[4] = (Worker) t;
        for (Worker worker: team) {
            worker.name();
            worker.sex();
            worker.experience();
            worker.jobName();

        }
    }
}
