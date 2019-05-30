import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Http {

    public static HttpURLConnection doGetRequest(String query) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(query).openConnection();
        connection.setRequestMethod("GET");
        return connection;
    }

    public static HttpURLConnection doPostRequest(String query) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(query).openConnection();
        connection.setRequestMethod("POST");
        return connection;
    }

    public static void print(HttpURLConnection connection) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("GET");
        HttpURLConnection get = doGetRequest("http://localhost:8080/calc");
        get.connect();
        print(get);
        System.out.println("POST");
        HttpURLConnection post = doPostRequest("http://localhost:8080/calc");
        get.connect();
        print(post);
    }
}