package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String path="C:\\Users\\1029291\\Desktop\\CSVREader2.csv";
	    String line=" ";
	    try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while ((line=bufferedReader.readLine())!=null){
                String[] values=line.split(",");
                System.out.println(values[0]+"*"+values[1]+"*"+values[2]+"*"+values[3]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
