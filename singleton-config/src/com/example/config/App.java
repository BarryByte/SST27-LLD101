package com.example.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws Exception {
        // String path = args.length > 0 ? args[0] : "app.properties";
        // AppSettings.getInstance().loadFromFile(Path.of(path)); // not thread-safe,
        // re-loadable
        // System.out.println("app.name=" + AppSettings.getInstance().get("app.name"));
        // System.out.println("instance=" +
        // System.identityHashCode(AppSettings.getInstance()));

        

        AppSettings original = AppSettings.INSTANCE;

        Constructor<AppSettings> c = AppSettings.class.getDeclaredConstructor();
        c.setAccessible(true);
        AppSettings hacked = c.newInstance(); // return runtime exception 

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.ser"));
        out.writeObject(original);
        

        

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.ser"));
        AppSettings clone = (AppSettings) in.readObject();

        System.out.println(original == clone); // should be true
    }
}
