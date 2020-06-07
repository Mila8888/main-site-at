package ru.geekbraibs.examples.exceptions;

import java.io.*;

public class FileNotFoundExample {
//first example

//    public static void main(String[] args) {
//        File file = new File("/path/to/file");
//        try {
//            FileReader reader = new FileReader(file);
//            System.out.println("Dangerous code!");
//        } catch (FileNotFoundException exception) {
//            System.out.println("Exception has been catched!");
//        } finally {
//            System.out.println("I'm finally and I have been executed!");
//        }
//    }

//    second example

//    public static void main(String[] args) {
//        FileReaderExample reader = new FileReaderExample();
//        try {
//            reader.readFile("123");
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/path/to/file"));

            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("block finally!");
            if (reader != null) {
                reader.close();
            }
        }
    }

}

