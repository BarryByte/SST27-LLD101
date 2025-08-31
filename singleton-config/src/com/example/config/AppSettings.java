package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance each time,
 * not thread-safe, reload allowed anytime, mutable global state, reflection+serialization-friendly.
 */
public enum AppSettings  {
// public class AppSettings implements Serializable {
    INSTANCE;
    private final Properties props = new Properties();
    
    // private static volatile AppSettings instance;

    // private  AppSettings() { 
    //     // handling reflection-hack
    //     if(instance != null){
    //         throw new RuntimeException("ALready a instance exists! use getInstance() \"Singleton violation: Use getInstance()\"");
    //     }
    // } 

    // private Object readResolve(){
    //     return instance;
    // }

    // public static AppSettings getInstance() {
    //     if(instance == null){
    //         synchronized(AppSettings.class){
    //             if(instance == null){
    //                 instance = new AppSettings();
    //             }
    //         }
    //     }
    //     return instance;
    // }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}
