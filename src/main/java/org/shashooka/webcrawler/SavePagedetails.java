package org.shashooka.webcrawler;

import java.io.FileWriter;
import java.io.IOException;

public class SavePagedetails {
    public String savetoDisk(String pageDetail, String diskPath) {
        System.out.println("Saving To Disk");
        try {
            FileWriter fw=new FileWriter(diskPath);
            fw.write(pageDetail);
            fw.close();
            return "Success";
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Couldn't be saved on the Disk");
        }
    }

}
