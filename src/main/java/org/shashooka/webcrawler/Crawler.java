package org.shashooka.webcrawler;

import okhttp3.OkHttpClient;
import okhttp3.*;
import org.shashooka.webcrawler.utils.GetTime;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


/**
 * Hello world!
 */
public class Crawler {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        GetPagedetails getPagedetails = new GetPagedetails();
        System.out.println(getPagedetails.listPage());
//        GetTime getTime = new GetTime();
//        System.out.print(getTime.getTime("Shantanu"));
//        getTime.banana();

    }
}

