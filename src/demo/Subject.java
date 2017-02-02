package demo;

/**
 * Created by ted on 2/2/17.
 */
public interface Subject {
    // 这个Observer接口是自定义的接口,而不是Java.Util的
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObservers();
}
