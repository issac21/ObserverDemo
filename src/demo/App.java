package demo;

/**
 * Created by ted on 2/2/17.
 */
public class App {
    public static void main(String[] args) {
        Hunter hunter = new Hunter();
        hunter.registerObserver(new JobSeeker("issac"));
        hunter.registerObserver(new JobSeeker("jason"));
        hunter.addJobs("Google");
        hunter.addJobs("Yahoo");
    }
}
