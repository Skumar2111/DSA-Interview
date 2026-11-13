package LLD.singletton;

/*
*
* */
public class SingletonConfiguration {

    public static final SingletonConfiguration instance = new SingletonConfiguration();

    private SingletonConfiguration() {
    }

    public static SingletonConfiguration getInstance()
    {
        return instance;
    }
}
