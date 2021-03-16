package patternSingleton;

public class Singletone {
    private static volatile Singletone uniqueInstance;
    private Singletone(){}
    public static  Singletone getInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new Singletone();
        }
        return uniqueInstance;
    }
}
