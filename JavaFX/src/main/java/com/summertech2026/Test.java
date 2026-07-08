package com.summertech2026;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class Test {
    public static void main(String args[]) throws IOException{
        File file = new File("src/main/resources/com/summertech2026/test.json");
        JSONObject jo = new JSONObject(new String(Files.readAllBytes(Paths.get(file.toURI()))));
        
        System.out.println(jo.get("test"));

        jo.put("new variable", 10);
    
        FileWriter writer = new FileWriter(file);
        writer.write(jo.toString());
        writer.close();
    }
}
