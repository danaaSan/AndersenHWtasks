package src;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            String classPath = "out/production/AndersenHWtasks2/src/";

            CustomClassLoader loader = new CustomClassLoader(classPath);

            Class<?> clas = loader.findClass("mypackage.MyClass");

            System.out.println("Class loaded by: " + clas.getClassLoader());

            Object obj = clas.getDeclaredConstructor().newInstance();

            Method method = clas.getMethod("hello");
            method.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

