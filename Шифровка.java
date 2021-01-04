package com.javarush.task.task18.task1826;

import java.io.*;
import java.nio.Buffer;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String key = args[0];
        String fileNameIn = args[1];
        String fileNameOut = args[2];
        FileInputStream fileReader = new FileInputStream(fileNameIn);
        FileOutputStream fileWriter = new FileOutputStream(fileNameOut);
        switch (key){
            case("-e"):
                while(fileReader.available() > 0){
                    fileWriter.write(fileReader.read() - 1);
                }
                break;
            case("-d"):
                while(fileReader.available() > 0){
                    fileWriter.write(fileReader.read() + 1);
                }
                break;
            default:
                break;
        }
        fileReader.close();
        fileWriter.close();
    }

}
