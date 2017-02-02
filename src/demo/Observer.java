package demo;

/**
 * Created by ted on 2/2/17.
 */
public interface Observer {
    //这里方法名什么都可以,方法的作用就是用来接收更新信息的接口
    public void update(Subject subject);
}
