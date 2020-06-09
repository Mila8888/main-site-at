package ru.geekbraibs.examples.exceptions;

import java.io.*;

public class FileReaderExample {

    //    second example - FileNotFoundExample

//    public FileReader readFile(String path) throws FileNotFoundException {
//        File file = new File(path);
//        return new FileReader(file);
//    }

    public static void printFirstString(String filePath) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String firstString = reader.readLine();
        System.out.println(firstString);
    }


}
