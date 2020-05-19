package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    List<String> listObj = new ArrayList<>(); // Не знаем, сколько "obj" будет в строке, так что создаем list для хранения промежуточных результатов
    StringBuilder stringBuilder = new StringBuilder();
    
    for (String str : ((r.readLine()).split("\\?")[1]).split("&")) {
        if (str.contains("=")) {
            if (str.contains("obj=")) listObj.add(str.split("=")[1]);
            stringBuilder.append(" ").append(str.split("=")[0]);
        } else stringBuilder.append(" ").append(str);
    }
    System.out.println(stringBuilder.delete(0, 1));
    
    for (String str : listObj)
      if (str.matches("-?\\d+(\\.\\d+)?")) alert(Double.parseDouble(str));
      else alert(str);
    }
    
    

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
