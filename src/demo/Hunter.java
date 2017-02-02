package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ted on 2/2/17.
 */
public class Hunter implements Subject {
    private List<Observer> userList;
    private List<String> jobs;

    public Hunter() {
        userList = new ArrayList<Observer>();
        jobs = new ArrayList<String>();
    }

    @Override
    public void registerObserver(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        //TODO
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : userList) {
            observer.update(this);
        }
    }

    public void addJobs(String job){
        jobs.add(job);
        notifyAllObservers();
    }

    public List<String> getJobs() {
        return jobs;
    }

    public String toString(){
        return jobs.toString();
    }
}
