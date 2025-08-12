package Creational.Singleton;

public class Singleton {

    // volatile
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data){
        this.data = data;
    }

    // non-multithread
    public static Singleton getInstance(String data){
        if(instance==null){
            instance = new Singleton(data);
        }
        return instance;
    }

    // multithread
    public static Singleton getInstanceMultiThread(String data){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance = new Singleton(data);
                }
            }
        }
        return instance;
    }

    // multithread
    public static Singleton getInstanceMultiThread_Optimized(String data){
        Singleton result = instance;
        if(result == null){
            synchronized(Singleton.class){
                result = instance;
                if(result == null){
                    instance  = result = new Singleton(data);
                }
            }
        }
        return result;
    }
}
