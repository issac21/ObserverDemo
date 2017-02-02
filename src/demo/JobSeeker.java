package demo;

/**
 * Created by ted on 2/2/17.
 */
public class JobSeeker implements Observer{
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name);
        System.out.println(subject.toString());
    }

}
