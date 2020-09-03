package com.com.censor;

import java.io.*;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Dictionary {
    private File dictionary;
    private HashSet<String> dict;

    public Dictionary(File dictionary) {
        this.dictionary = dictionary;
        this.dict = new HashSet<>();
    }

    //open dictionary and input every word to a hashset
    private void openDict() {
        try (Scanner scanner = new Scanner(new FileReader(dictionary))) {

            while(scanner.hasNextLine()) {
                dict.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (NoSuchElementException e) {
            e.getMessage();
        }
    }

    public HashSet getDict() {
        openDict();
        return dict;
    }


}
