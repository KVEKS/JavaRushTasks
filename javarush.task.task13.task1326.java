package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayList<Integer> array = new ArrayList<>();
        
        while(reader.ready()) {
            Integer number = Integer.parseInt(reader.readLine());
            if (number == null) { // если пустое число

            }
            else if(number % 2 == 0) {
                array.add(number);
            }

            else if(number < 0 && number % 2 == 0) {
                array.add(number);
            }
        }
        Collections.sort(array);
        array.forEach(n-> System.out.println(n));
        reader.close();
        inputStream.close();
    }
}
