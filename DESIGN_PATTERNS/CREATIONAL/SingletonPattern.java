package DESIGN_PATTERNS.CREATIONAL;

public class SingletonPattern {

    private static SingletonPattern instance;

    private SingletonPattern() {

        System.out.println("singleton is initializing");
    };

    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();

        }

        return instance;

    }

    public void doSomething() {
        System.out.println(" singleton is working");
    }

    // public static void main(String[] args) {

    // SingletonPattern p1 = SingletonPattern.getInstance();
    // SingletonPattern p2 = SingletonPattern.getInstance();

    // p1.doSomething();
    // p2.doSomething();

    // boolean isSameInstance = p1 == p2;

    // System.out.println("isSameInstance " + isSameInstance);

    // }

}
