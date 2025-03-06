package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CustomClassLoader extends ClassLoader {
    private final String classPath;

    public CustomClassLoader(String classPath) {
        this.classPath = classPath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            String filePath = classPath + "/" + name.replace('.', '/') + ".class";
            byte[] classBytes = Files.readAllBytes(Paths.get(filePath));
            return defineClass(name, classBytes, 0, classBytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException("Cant load" + name, e);
        }
    }
}


