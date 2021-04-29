package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output) {
        if(contacts==null || output==null){
            throw new IllegalArgumentException("No data");
        }
        StringBuilder toBeWritten = new StringBuilder();

        for(Map.Entry<String, String> temp: contacts.entrySet()){
            toBeWritten.append(temp.getKey()).append(": ").append(temp.getValue()).append("\n");
        }

        try (BufferedWriter br = Files.newBufferedWriter(Path.of(output))){
            br.write(toBeWritten.toString());
        } catch (IOException ioException) {
            throw new IllegalStateException("File not found", ioException);
        }
    }
}
