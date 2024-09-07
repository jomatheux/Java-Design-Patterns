package singleton;

public class SingletonEager{
    

    public static SingletonEager instance = new SingletonEager();

    private SingletonEager(){
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}