package API_Facade;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Facade {
    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        String jsonResult;

        try {
            URL url = new URL(urlString);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                jsonResult = content.toString();
            } catch (Exception e) {
                throw new IOException("Invalid URL", e);
            } finally {
                con.disconnect();
            }

            try {
                JSONParser parser = new JSONParser();
                JSONObject jsonObject = (JSONObject) parser.parse(jsonResult);
                if (jsonObject.containsKey(attributeName)) {
                    return jsonObject.get(attributeName).toString();
                } else {
                    throw new IllegalArgumentException("Attribute not found in JSON response");
                }
            } catch (Exception e) {
                throw new IOException("Error parsing JSON response", e);
            }

        } catch (java.net.MalformedURLException e) {
            throw new IOException("Invalid URL", e);
        }

    }
}
