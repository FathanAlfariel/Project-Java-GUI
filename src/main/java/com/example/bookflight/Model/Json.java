package com.example.bookflight.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Json {
    private String filePath;

    public Json(String filePath) {
        this.filePath = filePath;
    };

    public String readJSON() {
        StringBuilder jsonBuilder = new StringBuilder();

        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(this.filePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonBuilder.toString();
    }
}
