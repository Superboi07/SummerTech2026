package com.summertech2026;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class Test {
    public static void main(String args[]) throws IOException{
        File file = new File("src/main/resources/com/summertech2026/test.json");
        String content = new String(Files.readAllBytes(Paths.get(file.toURI())));
        JSONObject jo = new JSONObject(content);
        System.out.println(jo.get("test"));
    }
}