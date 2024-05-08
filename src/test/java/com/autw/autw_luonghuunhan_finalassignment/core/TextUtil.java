package com.autw.autw_luonghuunhan_finalassignment.core;

import java.io.File;
import java.util.Scanner;

public class TextUtil {
    public static String[][] readDataFromFileText(String path, int totalRows, int totalCols){
        try{
            //Source/input.txt
            File file = new File(path);
            Scanner myReader = new Scanner(file);
            myReader.nextLine();
            String[][] object = new String[totalRows][totalCols];
            int numTestData=0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                object[numTestData][0] = data.split(", ")[0];
                object[numTestData][1] = data.split(", ")[1];
                numTestData++;
            }
            myReader.close();
            return object;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
