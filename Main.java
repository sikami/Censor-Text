package com.com.censor;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Censor censor = new Censor(new File("/home/listya/Documents/Belajar/Java/REPROMPT/src/com/com/censor/sample.txt"));
        censor.censorFile();
    }
}
