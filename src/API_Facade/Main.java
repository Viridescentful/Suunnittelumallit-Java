package API_Facade;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.simple.JSONObject; // add Maven dependency for JSON.simple
import org.json.simple.parser.JSONParser; // add Maven dependency for JSON.simple

public class Main {
    private Facade facade;

    public static void main(String[] args) {
        Main client = new Main();
        client.facade = new Facade();

        try {
            String jokeText = client.facade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
            System.out.println(jokeText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
