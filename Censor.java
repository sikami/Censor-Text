package com.com.censor;


import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Censor {

    private Dictionary dictionary;
    private File file;

    public Censor(File file) {
        this.dictionary = new Dictionary(new File("/home/listya/Documents/Belajar/Java/REPROMPT/src/com/com/censor/banned.txt"));
        this.file = file;
    }


    public void censorFile() throws IOException {

        HashSet<String> dict = dictionary.getDict();
        FileWriter output = new FileWriter("newfile.txt");
        String x, newWord;
        StringBuilder sb = new StringBuilder();
        try(Scanner scanner = new Scanner(new FileReader(file))) {
            while(scanner.hasNextLine()) {
                x = scanner.nextLine();
                String[] words = x.split(" ");

                for(String word : words) {
                    String wordss = "";
                    if(dict.contains(word)) {
                        for (int i = 0; i < word.length(); i++) {
                            wordss += '*';
                        }
                        newWord = word.replace(word, wordss);
                        //output.write(newWord);
                        sb.append(newWord + " ");

                    } else {
                        sb.append(word + " ");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
        System.out.println(sb);

    }
}
