package src.mypackage;

public class MyClass {
    public void hello() {
        System.out.println("Its MyClass! "+ this.getClass().getClassLoader());
    }
}
