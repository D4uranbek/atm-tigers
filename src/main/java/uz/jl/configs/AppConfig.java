package uz.jl.configs;

import uz.jl.enums.http.HttpStatus;
import uz.jl.exceptions.APIException;
import uz.jl.models.settings.Language;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Elmurodov Javohir, Mon 12:21 PM. 11/29/2021
 */
public class AppConfig {
    public static Language language;

    private static final Properties properties = new Properties();

    public static void init() throws APIException {
        load();
        language = Language.getByCode(get("bank.default.language"));
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }

    private static void load() throws APIException {
        try {
            properties.load(new FileReader("src/main/resources/app.properties"));
        } catch (IOException e) {
            throw new APIException("File not found", HttpStatus.HTTP_404);
        }
    }
}
