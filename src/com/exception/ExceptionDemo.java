package com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class ExceptionDemo {
    public static void show(){
        try {
            FileReader fr = new FileReader("file.txt");
            int st = fr.read();
            new SimpleDateFormat().parse("");
        }
        catch (FileNotFoundException e){
            System.out.println("File doesn't exist");
        }
        catch (IOException e) {
            System.out.println("Could not read data");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
        //System.out.println(name);
    }
}
