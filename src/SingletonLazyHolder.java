public class SingletonLazyHolder{
    private static class InstanceHolder{
        public  static SingletonLazyHolder instance;
    }
    private SingletonLazyHolder(){
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
}