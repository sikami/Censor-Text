package com.com.censor;


import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Censor {

    private Dictionary dictionary;
    private File file;

    public Censor(File textPath, String dictionaryPath) {
        this.dictionary = new Dictionary(new File(dictionaryPath));
        this.file = textPath;
    }


    public void censorFile() throws IOException {
    // get the Hashset from class Dictionary where the censored words been uploaded
        HashSet<String> dict = dictionary.getDict();

    //create file output path
        FileWriter output = new FileWriter(System.getProperty("user.dir") + "/outputText.txt");

    //create variable to store the text words
        String x, newWord;
        StringBuilder sb = new StringBuilder();

    //read text file word per word and match it to Hashset from class dictionary, if found, replace bad words with *
        try(Scanner scanner = new Scanner(new FileReader(file))) {
            while(scanner.hasNextLine()) {
                x = scanner.nextLine().toLowerCase();
                String[] words = x.split(" ");

                for(String word : words) {
                    String wordss = "";
                    if(dict.contains(word)) {
                        for (int i = 0; i < word.length(); i++) {
                            wordss += '*';
                        }
                        newWord = word.replace(word, wordss);
                        sb.append(newWord + " ");

                    } else {
                        sb.append(word + " ");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }

    //write the output to the output text file and close the filewriter
        output.write(sb.toString());
        output.close();

    }
}
