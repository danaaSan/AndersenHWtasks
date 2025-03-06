package main.src;

public class Main {
    public static void main(String[] args) {
        try {
            String classPath = "pack/";  // Путь к скомпилированному файлу .class
            String className = "main.src.pack.Check";      // Полное имя класса

            // Используем наш кастомный загрузчик
            CustomClassLoader loader = new CustomClassLoader(classPath);

            // Принудительно загружаем класс через findClass()
            Class<?> loadedClass = loader.findClass(className);

            // Создаем экземпляр и вызываем метод
            Object instance = loadedClass.getDeclaredConstructor().newInstance();
            loadedClass.getMethod("checkClassLoader").invoke(instance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
