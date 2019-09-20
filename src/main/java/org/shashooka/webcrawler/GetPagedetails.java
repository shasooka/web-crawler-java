package org.shashooka.webcrawler;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GetPagedetails {
    public String listPage(){

        Properties config = new Properties();

        String myUrl = null;

        try {
            config.load(new FileReader("src/main/resources/config.properties"));
            myUrl = config.getProperty("scrape_url");
        } catch (IOException e) {
            System.out.println("Something went wrong!!");
            e.printStackTrace();
        }

        OkHttpClient client = new OkHttpClient();
        System.out.println("The url is " + myUrl);
        Request request = new Request.Builder()
                .url("https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html")
                .build();

        try (Response response = client.newCall(request).execute()) {
//            System.out.println(response.body().string());
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not load URL");
            //return "";
        }

    }
}
