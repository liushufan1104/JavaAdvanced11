package com.example.lib;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class readTxt {
    private String Address = "";
    private String InvoiceNumber[] = new String[7];
    private int LineNumber=0;
    public readTxt(String address) {
        try {
            Address = address;
            File file = new File(Address);
            FileInputStream readIn = new FileInputStream(file);
            InputStreamReader read = new InputStreamReader(readIn, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(read);
            String oneLine = null;
            while ((oneLine = bufferedReader.readLine()) != null) {
                InvoiceNumber[LineNumber]=oneLine;
                LineNumber++;
            }
            read.close();
        } catch (Exception e) {
            System.out.println("??????¢D????e¢DX??");
            e.printStackTrace();
        }
    }
    public String[] getInvoiceNumber(){
        return InvoiceNumber;
    }
}