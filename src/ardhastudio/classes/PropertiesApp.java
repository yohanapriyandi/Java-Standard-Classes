package ardhastudio.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("Application.properties"));

            String host = properties.getProperty("database.host");
            String port  = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password
            );
        }catch (FileNotFoundException exception){
            System.out.println("File tidak djitemukan");
        }catch (IOException exception){
            System.out.println("gagal load data dari file");
        }

        try {
            Properties properties = new Properties();

            properties.put("database.name", "DBApp");
            properties.put("database.username", "root");

            properties.store(new FileOutputStream("app.properties"),"konfigurasi db");
        }catch (FileNotFoundException exception){
            System.out.println("Error creating file");
        }catch (IOException exception){
            System.out.println("Error saving file");
        }

    }
}
