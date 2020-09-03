package com.com.censor;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Censor censor = new Censor(new File("Put Your Text File Path here (the one to be censored)"),
                "If you have dictionary of bad words, put the dictionary path here");
        censor.censorFile();
    }
}
