package uz.jl;

import uz.jl.configs.Loaders;
import uz.jl.exceptions.APIException;

/**
 * @author Elmurodov Javohir, Mon 11:47 AM. 11/29/2021
 */

public class App {
    static {
        try {
            String a = null;
            if (a.startsWith("dsds")){
                System.out.println("😎");
            }
            Loaders.init();
        } catch (APIException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }

}
