package com.javarush.task.task13.task1318;
import java.util.*;
import java.io.*;
/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        int i;

        while((i=fileInputStream.read())!= -1){

           System.out.print((char)i);
        }
        reader.close();
        fileInputStream.close();

    }
}
