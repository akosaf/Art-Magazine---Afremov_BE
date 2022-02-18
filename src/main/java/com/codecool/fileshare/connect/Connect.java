package com.codecool.fileshare.connect;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Connect {

    private final static String DATA_FILE = "src/main/resources/application.properties";

    public static void createConnection(String user, String password) {
        String[] lines = new String[7];
        lines[0] = "spring.datasource.url=jdbc:postgresql://localhost:5432/artmagazine";
        lines[1] = "spring.datasource.username=" + user;
        lines[2] = "spring.datasource.password=" + password;
        lines[3] = "spring.jpa.hibernate.ddl-auto=none";
        lines[4] = "spring.jpa.show-sql=true";
        lines[5] = "spring.jpa.properities.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect";
        lines[6] = "spring.jpa.properities.hibernate.format_sql=true";

        writeToFile(lines);

    }

    public static void writeToFile(String[] lines) {
        File file = new File(DATA_FILE);

        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter(file, true)) {

            for (String line : lines) {
                fileWriter.append(line).append("\n");
            }

        } catch (IOException e) {
            System.out.println(("ALERT! There was an error during file writing!\n"));
        }
    }
}
