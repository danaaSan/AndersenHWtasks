package main.src;

public class Main {
    public static void main(String[] args) {
        try {
            String classPath = "pack/";
            String className = "pack.Check";

            CustomClassLoader loader = new CustomClassLoader(classPath);

            Class<?> loadedClass = loader.loadClass(className);

            // Create an instance and invoke a method
            Object instance = loadedClass.getDeclaredConstructor().newInstance();
            loadedClass.getMethod("checkClassLoader").invoke(instance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}