import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;

public class HttpTests {
    @Test
    public void doGetTest(){
        try {
            HttpURLConnection connection = Http.doGetRequest("http://localhost:8080/calc");
            connection.connect();
            Assert.assertEquals(HttpURLConnection.HTTP_OK, connection.getResponseCode());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void doPostTest(){
        try {
            HttpURLConnection connection = Http.doPostRequest("http://localhost:8080/calc");
            connection.connect();
            Assert.assertEquals(HttpURLConnection.HTTP_OK, connection.getResponseCode());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
