package com.com.censor;

import java.io.File;
import java.util.HashSet;

public class Censor {
//        Dictionary x = new Dictionary(new File("/home/listya/Documents/Belajar/Java/REPROMPT/src/com/com/censor/banned.txt"));
    private File file;
    private Dictionary dictionary;
    private HashSet<String> dict;

    public Censor(File file, Dictionary dictionary) {
        this.file = file;
        this.dictionary = dictionary;
    }

    public void censorFile() {
        dict = dictionary.getDict();


    }
}
