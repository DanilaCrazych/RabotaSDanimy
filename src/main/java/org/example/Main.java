package org.example;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Main {

    public static void main(String[] args) throws IOException {
    try {
        FileInputStream fis = new FileInputStream("C:/Users/mag7i/Desktop/номера.xlsx");
        File file = new File("C:/Users/mag7i/Desktop/номера.txt");
        FileWriter fileWriter = new FileWriter(file);
        Workbook ex = new HSSFWorkbook(fis);
        String result = ex.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
        System.out.println(result);
        fis.close();

        fileWriter.write(result);
        fileWriter.flush();

    }catch (IOException f){
        System.out.println(f);
    }
    }
}