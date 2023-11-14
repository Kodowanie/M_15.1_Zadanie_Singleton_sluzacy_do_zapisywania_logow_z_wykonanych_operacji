package patterns.singleton;

public class Main {
    public static void main(String[] args) {

        Logger l =  Logger.INSTANCE;
        l.log("Something");
        l.getLastLog();


    }
}