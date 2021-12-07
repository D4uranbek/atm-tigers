package uz.jl.configs;

import uz.jl.enums.http.HttpStatus;
import uz.jl.exceptions.APIException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Elmurodov Javohir, Mon 12:21 PM. 11/29/2021
 */
public class AppConfig {
    private static Properties properties = new Properties();

    public static void init() throws APIException {
        load();
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }

    private static void load() throws APIException {
        try {
            properties.load(new FileReader("app.properties"));
        } catch (IOException e) {
            throw new APIException("File Topilmadi", HttpStatus.HTTP_404);
        }
    }

}
