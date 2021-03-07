package in.co.dreamsdoor.jsonparsing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JsonProvider {

    public static String getJsonDataString(String filePath) {
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.next());
            }
            return stringBuilder.toString();

        } catch (FileNotFoundException ex) {
            return "Error : " + ex.getLocalizedMessage();
        }
    }
}
